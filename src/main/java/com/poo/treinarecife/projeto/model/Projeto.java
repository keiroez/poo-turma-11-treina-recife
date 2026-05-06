package com.poo.treinarecife.projeto.model;

import java.time.LocalDate;

public class Projeto {


    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private StatusProjeto status;


    
    public Projeto() {
    }



    public Projeto(Long id, String nome, String descricao, LocalDate dataInicio, LocalDate dataConclusao,
            StatusProjeto status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.status = status;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public LocalDate getDataInicio() {
        return dataInicio;
    }



    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }



    public LocalDate getDataConclusao() {
        return dataConclusao;
    }



    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }



    public StatusProjeto getStatus() {
        return status;
    }



    public void setStatus(StatusProjeto status) {
        this.status = status;
    }


    
    

    
}
