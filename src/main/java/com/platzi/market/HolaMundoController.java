package com.platzi.market;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {


    @GetMapping("/hola")
    public String consultar(){
      return "Hola mundo";
    }
}
