package com.company;
import java.util.Queue;
import java.util.LinkedList;
public class Digraph {
    private int vertexes;
    private int arcs = 0;
    private int ordem = 0;
    private int[][] adj;
    private int[] visit;
    private int capital;
    private Queue<Integer> sequenciar = new LinkedList<Integer>();

    public void addArc(int orig, int dest) { //orig(em) dest(ino)
        if (this.adj[orig][dest] == 0) {
            this.adj[orig][dest] = 1;
            ++this.arcs;
        }
        else {
            System.out.println("Arco já existente");
        }
    }
    public void contagem(){
        int depth = 0; //a profundidade ou distância da capital
        //limpa os vetores de visitação e contagem
        for (int i = 0; i < this.vertexes; ++i) {
            this.visit[i] = -1;
        }
        computarGrafo();
        System.out.println("Capital: " + this.capital);
        System.out.println("---------------------------------------------------------------");
        for(int i = 0; i < this.vertexes; i++){
            //System.out.println("Vertex: " + i + " | " + " Ordem: " + this.visit[i]);
            for(int j = 0; j < this.vertexes; j++){
                if(this.visit[j] == i){
                    System.out.println("Vertex: " + j + " | " + " Ordem: " + this.visit[j]);
                }
            }
        }
        this.sequenciar.clear();
    }
    private void computarGrafo(){
        int order = 0;
        this.sequenciar.add(this.capital);
        while(!sequenciar.isEmpty()){
            int x = sequenciar.poll();
            if(x == this.capital){
                this.visit[x] = order;
            }
            if(this.visit[x] == -1){
                order++;
                this.visit[x] = order;
            }
            for(int i = 0; i < this.vertexes; i++){
                if(this.adj[x][i] == 1 && this.visit[i] == -1){
                    sequenciar.add(i);
                }
            }
        }
    }

    //versão teste
    public Digraph(int x, int tamanho) {
        this.adj = new int[tamanho][tamanho];
        this.visit = new int[tamanho];
        this.vertexes = tamanho;
        this.capital = x;
        for (int i = 0; i < this.vertexes; i++) {
            this.visit[i] = -1;
        }
    }
}
