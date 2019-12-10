package com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidException;
import com.treinaweb.javaoo.classes.Carro;
import com.treinaweb.javaoo.classes.Moto;
import com.treinaweb.javaoo.classes.Veiculo;

public class Main {

    public static void main(String[] args) {
        try {

            //Carro corsa = new Carro();
            Veiculo corsa = new Moto(); //um veículo corsa é um carro. objeto polimórfico... tanto carro quanto moto são veículos
            //((Carro)corsa).setQtdPortas(4);
            corsa.setChassi("90545");
            corsa.setNome("Corsa");
           // corsa.ligar();
            System.out.println(corsa.getNome() + "\n" + corsa.getChassi() + "\n" + corsa.getQtdRodas());
            System.out.println(String.format("O veiculo %s está ligado? %b", corsa.getNome(), corsa.isLigado()));
//            Moto fazer = new Moto();
//            fazer.setMarca("Yamaha");
//            fazer.setNome("Fazer");
            corsa.abastecer(10);
            corsa.ligar();
            corsa.acelerar();
            System.out.println(String.format("Velocidade atual do veículo %f,", corsa.getVelocidade()));
            corsa.frear();
            System.out.println(String.format("Velocidade atual do veículo %f", corsa.getVelocidade()));

        } catch(AbastecimentoVeiculoLigadoException erro) {
            System.out.println("Você não pode abastecer um veículo enquanto ele estiver ligado");
        } catch (ChassiInvalidException e) {
            System.out.println("Chassi invalido" + e.getMessage());
        } catch (Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

}
