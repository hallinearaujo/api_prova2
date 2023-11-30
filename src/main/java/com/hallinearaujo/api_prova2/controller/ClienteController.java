package com.hallinearaujo.api_prova2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @RequestMapping(value = "/bemVindo{nome}", method = RequestMethod.GET)
    @ResponseBody
    public String bemVindoCliente( @PathVariable("nome") String nomeCliente){
        return String.format("Bem Vindo %s", nomeCliente);

    }
}
