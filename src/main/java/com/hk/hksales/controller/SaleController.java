package com.hk.hksales.controller;

import com.hk.hksales.dto.login.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SaleController {

    @RequestMapping("/createSalePage")
    public String createSalePage(Map<String, Object> model) {
        model.put("message", "Sale page");
        return "createSale";
    }

    @PostMapping("/createSale")
    public String create(@ModelAttribute LoginRequest loginRequest) {
        return "productList";
    }
}
