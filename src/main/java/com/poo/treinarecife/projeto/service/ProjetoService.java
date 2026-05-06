package com.poo.treinarecife.projeto.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.poo.treinarecife.projeto.model.Projeto;
import com.poo.treinarecife.projeto.model.StatusProjeto;
import com.poo.treinarecife.projeto.service.interfaces.CrudInterface;

@Service
public class ProjetoService implements CrudInterface<Projeto> {

    @Override
    public void atualizar(Projeto t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletar(Projeto t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Projeto inserir(Projeto t) {
        return t;
    }

    @Override
    public Projeto obter() {
        return new Projeto(
            1L,
            "POO",
            "Aula de POO",
            LocalDate.now(),
            LocalDate.now().plusDays(3),
            new StatusProjeto("ativo")
        );
    }



}
