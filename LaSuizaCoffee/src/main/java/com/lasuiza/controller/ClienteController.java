
package com.lasuiza.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class ClienteController {
    
    @GetMapping("/")
    public String inicio() {
        return "index";
    }
}
