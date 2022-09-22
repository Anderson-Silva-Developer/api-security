package com.anderson.apisecurity.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @GetMapping
    public ResponseEntity<String> contato(){
        String contato="(00) 90000-1111";
        return  ResponseEntity.status(HttpStatus.OK).body(contato);
    }
    @PostMapping
    public ResponseEntity<String> contato(@RequestBody String contato){
        return ResponseEntity.status(HttpStatus.CREATED).body(contato);
    }
}
