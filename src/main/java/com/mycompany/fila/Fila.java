package com.mycompany.fila;

/**
 *
 * @author 119119592 - Lucas Vilas Boas Lage , Leandro César
 */

public class Fila {

    private static class Celula {

        Object item;
        Celula prox;

    }
    private Celula fundo, topo;
    Celula prox;
    private int tam;

    public Fila() {
        this.topo = null;
        this.tam = 0;
    }

    public boolean isNull() {
        return (this.topo == null);
    }

    public void insert(Object x, int i) {
        Celula aux = this.topo;
        this.topo = new Celula();
        this.topo.item = x;
        this.topo.prox = aux;

        this.fundo = this.topo.prox;
        this.tam++;
    }

    public Object remove() throws Exception {
        if (this.isNull()) {
            throw new Exception("Fila vazia!");
        }
        Object item = null;
        try {
            item = this.fundo.item;
            this.topo = this.fundo;
            this.fundo = this.fundo.prox;
        } catch (Exception e) {
            this.topo = null;
        }
        this.tam--;
        return item;
    }

    public void print() throws Exception {
        Celula aux = this.topo;
        try {
            while (aux != null) {
                System.out.println(aux.item);
                aux = aux.prox;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}