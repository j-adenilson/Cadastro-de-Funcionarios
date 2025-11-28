package com.cadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {

    @GetMapping("/home")
    public String boasVindas(){
        return "Minha primeira mensagem";
    }

}
