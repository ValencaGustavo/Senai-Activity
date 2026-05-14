package Exerc;

public class Main {

    public static void main(String[] args) {

//Lifo
        Pilha pilha = new Pilha();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.print("Pilha: ");
        pilha.exibir();

        System.out.println("Ultimo número: " + pilha.topo());

        System.out.println("Removido: " + pilha.pop());

        System.out.print("Pilha atual: ");
        pilha.exibir();

//FIfo
        Fila fila = new Fila();

        fila.enqueue(100);
        fila.enqueue(200);
        fila.enqueue(300);

        System.out.print("Fila: ");
        fila.exibir();

        System.out.println("Primeiro número: " + fila.frente());

        System.out.println("Removido: " + fila.dequeue());

        System.out.print("Fila atual: ");
        fila.exibir();
    }
}