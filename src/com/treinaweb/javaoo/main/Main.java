package com.treinaweb.javaoo.main;

import com.treinaweb.javaoo.classes.Carro;

public class Main {

    public static void main(String[] args) {
        try {
            Carro corsa = new Carro();
            corsa.setChassi("90545");
            corsa.setNome("Corsa");
           // corsa.ligar();
            System.out.println(corsa.getNome() + "\n" + corsa.getChassi() + "\n" + corsa.getQtdRodas());
            System.out.println(String.format("O veiculo %s está ligado? %b", corsa.getNome(), corsa.isLigado()));

//            Carro z370 = new Carro();
//            z370.ligar();
//            z370.desligar();
//            z370.getQtdRodas();

        } catch (Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

}
