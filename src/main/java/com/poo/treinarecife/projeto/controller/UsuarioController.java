package com.poo.treinarecife.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.treinarecife.projeto.model.Usuario;
import com.poo.treinarecife.projeto.model.dto.UsuarioDTO;
import com.poo.treinarecife.projeto.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public Usuario obterUsuario(){
        return usuarioService.obter();
    }

    @GetMapping("/dto")
    public UsuarioDTO obterUsuarioDTO(){
        return usuarioService.obter().toDTO();
    }

    @PostMapping("/create")
    public void inserirUsuario(@RequestBody UsuarioDTO usuario){

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

    }

}
