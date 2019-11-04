package com.company;

import java.util.ArrayList;

public class Digraph {
    private int numVertex;
    private int vertexCounter = 0;
    public ArrayList[] vertexes;
    public Digraph(int tamanho){
        this.numVertex = tamanho;
        vertexes = new ArrayList[tamanho];
        for(int i = 0; i <this.numVertex;i++){
            vertexes[i] = new ArrayList();
        }
    }
    public void addAresta(int x, int y){
        vertexes[y].add(x);
        vertexes[x].add(y);
        vertexCounter++;
    }
    public void showArestas(){
        for(int i = 0; i < this.numVertex; i++){
            System.out.println(i + " : " + vertexes[i]);
        }
    }
    public void removeVertex(int remv){
        for(int i = 0; i < this.numVertex; i++){
            if(vertexes[i].contains(remv)){
                vertexes[i].remove(remv);
            }
        }
    }
    public void removeArc(Integer org, Integer remv){
        if(vertexes[org].contains(remv)){
            vertexes[org].remove(remv);
        }
        if(vertexes[remv].contains(org)){
            vertexes[remv].remove(org);
        }
    }
}
