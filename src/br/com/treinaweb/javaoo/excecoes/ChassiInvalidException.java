package br.com.treinaweb.javaoo.excecoes;

public class ChassiInvalidException extends Exception {

    public ChassiInvalidException(String chassi){
        super(String.format("Este chassi é considerado invalido [%s]", chassi));
    }
}
