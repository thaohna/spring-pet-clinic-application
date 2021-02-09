package com.anhthao.petclinic.controllers;

import com.anhthao.petclinic.services.OwnerService;
import com.anhthao.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {


    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    String index(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
