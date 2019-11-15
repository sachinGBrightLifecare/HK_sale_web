package com.hk.hksales.controller;

import com.hk.hksales.dto.listing.ListingRequest;
import com.hk.hksales.dto.product.VariantDetail;
import com.hk.hksales.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/getProductList")
    public String getProductList(@ModelAttribute ListingRequest listingRequest,Map<String, Object> model) {
        listingRequest.setPageNumber(1);
        List<VariantDetail> variantDetailList =  productService.getVariantList(listingRequest);
        model.put("variantDetailList",variantDetailList);
        return "productList";
    }
}
