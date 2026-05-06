package com.poo.treinarecife.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.treinarecife.projeto.model.Projeto;
import com.poo.treinarecife.projeto.service.ProjetoService;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public Projeto obter(){
        return projetoService.obter();
    }
}
