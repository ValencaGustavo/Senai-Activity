package Exerc;

import java.util.ArrayList;

public class Pilha {

    private ArrayList<Integer> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void push(int valor) {
        elementos.add(valor);
    }

    public int pop() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia!");
        }

        return elementos.remove(elementos.size() - 1);
    }

    public int topo() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia!");
        }

        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public void exibir() {
        System.out.println(elementos);
    }
}