package com.anhthao.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    String index(){
        return "vets/index";
    }
}
