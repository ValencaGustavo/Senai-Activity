package Exerc;

import java.util.ArrayList;

public class Fila {

    private ArrayList<Integer> elementos;

    public Fila() {
        elementos = new ArrayList<>();
    }

    public void enqueue(int valor) {
        elementos.add(valor);
    }

    public int dequeue() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }

        return elementos.remove(0);
    }

    public int frente() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }

        return elementos.get(0);
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public void exibir() {
        System.out.println(elementos);
    }
}