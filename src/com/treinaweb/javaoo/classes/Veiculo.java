package com.treinaweb.javaoo.classes;


import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public class Veiculo {
    private String nome;
    private String chassi;
    private String marca;
    protected int qtdRodas; //atributo visivel apenas nessa classe mãe e suas filhas (carro)
    private boolean ligado;
    private float qtdCombustivel;
    protected float velocidade;

    public Veiculo() {
        this.ligado = false;
        this.velocidade = 0;
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

    public void setChassi(String chassi) throws ChassiInvalidException {
        if (chassi.length() == 5)
            this.chassi = chassi;
        else
            throw new ChassiInvalidException(chassi); //esta classe não possui construtor, então ela herda de Object.
                                                // que possui um construtor vazio
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public float getVelocidade() {
        return velocidade;
    }


    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        this.ligado = true;
        this.velocidade = 0;
        System.out.println("O veículo está ligado");
    }

    public void desligar(){
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("O veículo está desligado");
    }

    public void abastecer(float litros) throws AbastecimentoVeiculoLigadoException{
        if(!this.ligado)
            qtdCombustivel += litros;
        else
            throw new AbastecimentoVeiculoLigadoException();
    }

    public void acelerar() throws AceleracaoVeiculoLigadoException{
        if(this.ligado)
            this.velocidade += 10;
        else{
            throw new AceleracaoVeiculoLigadoException();
        }
    }

    public void frear() throws FrenagemVeiculoDesligadoException{
        if(this.ligado)
            this.velocidade -= 10;
        else{
            throw new FrenagemVeiculoDesligadoException();
        }
    }
}
