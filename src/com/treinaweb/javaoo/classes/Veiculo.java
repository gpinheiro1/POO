package com.treinaweb.javaoo.classes;


import br.com.treinaweb.javaoo.excecoes.ChassiInvalidException;

public class Veiculo {
    private String nome;
    private String chassi;
    private String marca;
    protected int qtdRodas; //atributo visivel apenas nessa classe mãe e suas filhas (carro)
    private boolean ligado;

    public Veiculo() {
        this.ligado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws Exception {
        if (chassi.length() == 5)
            this.chassi = chassi;
        else
            throw new ChassiInvalidException(chassi); //esta classe não possui construtor, então ela herda de Object.
                                                // que possui um construtor vazio
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    //    public void setQtdRodas(int qtdRodas) {
//        this.qtdRodas = qtdRodas;
//    } este metodo não faz sentido estar aqui

    public void ligar(){
        this.ligado = true;
        System.out.println("O veículo está ligado");
    }

    public void desligar(){
        this.ligado = false;
        System.out.println("O veículo está desligado");
    }
}


