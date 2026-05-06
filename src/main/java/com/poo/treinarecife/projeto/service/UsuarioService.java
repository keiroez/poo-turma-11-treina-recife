package com.poo.treinarecife.projeto.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.poo.treinarecife.projeto.model.StatusUsuario;
import com.poo.treinarecife.projeto.model.Usuario;
import com.poo.treinarecife.projeto.service.interfaces.CrudInterface;

@Service
public class UsuarioService implements CrudInterface<Usuario> {

    

    @Override
    public void atualizar(Usuario t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletar(Usuario t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Usuario inserir(Usuario t) {
       return t;
        
    }

    @Override
    public Usuario obter() {
        return new Usuario(
            1L, 
            "treina", 
            "121345", 
            "treina@recife.com", 
            "1234", 
            LocalDate.now(), 
            new StatusUsuario("ativo")
        );
    }

}
