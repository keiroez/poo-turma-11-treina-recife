package com.poo.treinarecife.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.treinarecife.projeto.model.Tarefa;
import com.poo.treinarecife.projeto.service.TarefaService;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;


    @GetMapping
    public Tarefa obter(){
        return tarefaService.obter();
    }
}
