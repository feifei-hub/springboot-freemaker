package com.prosay.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("free")
public class FreemarkerController {

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("name", "lisi");
        return "freemarker";
    }
}
