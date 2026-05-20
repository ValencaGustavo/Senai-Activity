package listaLigadaOrdenada;

public class ListaLigadaOrdenada {

    No cabeca;

    public void adicionarOrdenado(int valor) {
        No novoNo = new No(valor);

        if (cabeca == null || valor <= cabeca.valor) {
            novoNo.proximo = cabeca;
            cabeca = novoNo;
            return;
        }

        No atual = cabeca;
        while (atual.proximo != null && atual.proximo.valor < valor) {
            atual = atual.proximo;
        }

        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
    }

    public void exibirLista() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) {
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}
