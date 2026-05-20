package listaLigadaOrdenada;

public class Aplicacao {

    public static void main(String[] args) {
        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();

        lista.adicionarOrdenado(10);
        lista.adicionarOrdenado(5);
        lista.adicionarOrdenado(8);
        lista.adicionarOrdenado(20);

        lista.exibirLista();
    }
}
