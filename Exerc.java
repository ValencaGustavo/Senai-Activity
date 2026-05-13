public class Exerc {

    private class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
        }
    }

    private No cabeca;
    private No cauda;
    private int tamanho;

    public void adicionar(int valor) {

        No novo = new No(valor);

        if (cabeca == null) {
            cabeca = novo;
            cauda = novo;
        } else {
            cauda.proximo = novo;
            cauda = novo;
        }

        tamanho++;
    }

    public void removerPorPosicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (posicao == 0) {

            cabeca = cabeca.proximo;

            if (cabeca == null) {
                cauda = null;
            }

            tamanho--;
            return;
        }

        No atual = cabeca;

        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }

        No removido = atual.proximo;

        atual.proximo = removido.proximo;

        if (removido == cauda) {
            cauda = atual;
        }

        tamanho--;
    }

    public void exibir() {

        No atual = cabeca;

        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }
}