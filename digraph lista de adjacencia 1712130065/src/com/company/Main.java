package com.company;

public class Main {

    public static void main(String[] args) {
	    Digraph d1 = new Digraph(7);
	    d1.addAresta(1,2);
	    d1.addAresta(1,3);
	    d1.addAresta(2,4);
        d1.addAresta(3,4);
        d1.addAresta(4,5);
        d1.addAresta(5,6);
        d1.showArestas();
        d1.removeArc(1,2);
        System.out.println("-------------------------");
        d1.showArestas();
    }
}
