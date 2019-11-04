package com.company;

public class Main {

    public static void main(String[] args) {
        Digraph teste = new Digraph(0,6);
        teste.addArc(0,2);
        teste.addArc(0,3);
        teste.addArc(0,4);
        teste.addArc(1,2);
        teste.addArc(1,4);
        teste.addArc(2,4);
        teste.addArc(1,2);
        teste.addArc(3,4);
        teste.addArc(3,5);
        teste.addArc(4,5);
        teste.addArc(5,1);
        teste.contagem();
    }
}
