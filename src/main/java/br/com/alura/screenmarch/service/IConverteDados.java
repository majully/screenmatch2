package br.com.alura.screenmarch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
