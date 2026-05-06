package com.poo.treinarecife.projeto.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.poo.treinarecife.projeto.model.Prioridade;
import com.poo.treinarecife.projeto.model.StatusTarefa;
import com.poo.treinarecife.projeto.model.Tarefa;
import com.poo.treinarecife.projeto.service.interfaces.CrudInterface;

@Service
public class TarefaService implements CrudInterface<Tarefa> {

    @Override
    public void atualizar(Tarefa t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletar(Tarefa t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Tarefa inserir(Tarefa t) {
        return t;
    }

    @Override
    public Tarefa obter() {
        return new Tarefa(
            1L, 
            "Aula 6", 
            "Aula de projeto", 
            LocalDate.now(), 
            LocalDate.now().plusMonths(5), 
            new Prioridade("maxima"), 
            new StatusTarefa("ativa")
        );
    }
    
}
