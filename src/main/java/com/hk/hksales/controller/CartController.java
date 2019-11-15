package com.hk.hksales.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class CartController {

    @RequestMapping("/saveShippingCartLineItem")
    public String saveShippingCartLineItem(Map<String, Object> model) {
        return "productList";
    }
}
