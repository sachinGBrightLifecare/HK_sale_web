package com.hk.hksales.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hk.hksales.constant.RestAPIConfig;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;


@Service
public class Rest {

    private static Logger logger = LoggerFactory.getLogger(Rest.class);

//    @Value("${api.server.path}")
    private static String apiServerPath = "http://192.168.221.224:7171";

    public static <Req, Resp> Resp exec(String path, Req req, String method,
                                        Class<Resp> jClass, Map<String, String> headers) {

        String url = apiServerPath + path;
        url = url.replaceAll(" ", "%20");

        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        HttpUriRequest httpUriRequest = null;
        ObjectMapper objectMapper = new ObjectMapper();
        String payLoadString = null;
        StringEntity payLoad = null;
        if (req != null) {
            try {
                payLoadString = objectMapper.writeValueAsString(req);
                payLoad = new StringEntity(payLoadString);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (method.equalsIgnoreCase("put")) {
            httpUriRequest = new HttpPut(url);
            ((HttpPut) httpUriRequest).setEntity(payLoad);
        } else if (method.equalsIgnoreCase("post")) {
            httpUriRequest = new HttpPost(url);
            ((HttpPost) httpUriRequest).setEntity(payLoad);
        } else if (method.equalsIgnoreCase("get")) {
            httpUriRequest = new HttpGet(url);
        }

        httpUriRequest.setHeader("apikey", "XX");
        httpUriRequest.setHeader("APP_VER_NUMBER", "x.x");
        HttpResponse httpResponse = null;
        Resp resp = null;

        try {
            httpResponse = defaultHttpClient.execute(httpUriRequest);
        } catch (Exception e) {
            logger.error("Exception during rest call.");
        }
        if (httpResponse != null) {
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode >= 200 && statusCode <= 210) {
                try {
                    if (jClass != null && !jClass.equals(HttpResponse.class)) {
                        resp = objectMapper.readValue(httpResponse.getEntity()
                                .getContent(), jClass);
                    } else if (jClass != null
                            && jClass.equals(HttpResponse.class)) {
                        resp = (Resp) httpResponse;
                    }
                } catch (JsonParseException e) {
                    e.printStackTrace();
                } catch (JsonMappingException e) {
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                resp = (Resp) httpResponse;
                if (statusCode == 400) {
                    // Toast.makeText(context, text, duration)
                }
            }
        } else {
            return null;
        }
        return resp;
    }
}
