package com.treinaweb.javaoo.classes;

//carro herdou de veículo, então carro ganha tudo que um veículo tem.
public class Carro extends Veiculo {

    private int qtdPortas;

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public Carro(){
        //super();
        this.qtdRodas = 4;
    }

    public Carro(String nome, String marca) {
        //super();
        this.qtdRodas = 4;
        this.setNome(nome);
        this.setMarca(marca);
    }

}
