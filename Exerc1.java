import java.util.ArrayList;

public class Exerc1 {
    private ArrayList<Integer> lista;
    
    public Exerc1() {
        lista = new ArrayList<>();
    }
    
    public void inserirNoInicio(int valor) {
        lista.addFirst(valor);
    }
    
    public void printLista() {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
        
        System.out.print("Lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    
    public boolean estaVazia() {
        return lista.isEmpty();
    }
    
    public int tamanho() {
        return lista.size();
    }
 
    public static void main(String[] args) {
        Exerc1 lista = new Exerc1();
        
        System.out.println("Inserindo elementos no início usando ArrayList:");
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        lista.inserirNoInicio(30);
        lista.inserirNoInicio(40);
        
        lista.printLista();
        System.out.println("Tamanho: " + lista.tamanho());
        
        lista.inserirNoInicio(5);
        lista.inserirNoInicio(1);
        
        lista.printLista();
        System.out.println("Tamanho: " + lista.tamanho());
    }
}