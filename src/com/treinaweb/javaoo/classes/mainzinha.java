package com.treinaweb.javaoo.classes;

public class mainzinha {

    public static void main (String[] args ){
        Pessoa a = new Pessoa("Giovana", 22);
        Pessoa b = new Pessoa("Thiago", 22);
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
