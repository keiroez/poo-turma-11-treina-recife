package com.poo.treinarecife.projeto.service.interfaces;

public interface CrudInterface <T> {
    T inserir(T t);
    void atualizar(T t);
    T obter();
    void deletar(T t);
}
