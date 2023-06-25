class No {
    int valor;
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adicionar(int valor) {
        raiz = adicionarNo(raiz, valor);
    }

    private No adicionarNo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (no.esquerda == null) {
            no.esquerda = adicionarNo(no.esquerda, valor);
        } else {
            no.direita = adicionarNo(no.direita, valor);
        }

        return no;
    }

    public void percorrerArvoreRecursivamente() {
        percorrerArvoreRecursivamente(raiz);
        System.out.println();
    }

    private void percorrerArvoreRecursivamente(No no) {
        if (no == null) {
            return;
        }

        percorrerArvoreRecursivamente(no.esquerda);
        System.out.print(no.valor + " ");
        percorrerArvoreRecursivamente(no.direita);
    }

    public void mostrarArvore() {
        mostrarArvoreRecursivamente(raiz, "");
    }

    private void mostrarArvoreRecursivamente(No no, String espaco) {
        if (no == null) {
            return;
        }

        String prefixo = espaco + "+--";
        System.out.println(prefixo + no.valor);
        mostrarArvoreRecursivamente(no.esquerda, espaco + "|  ");
        mostrarArvoreRecursivamente(no.direita, espaco + "|  ");
    }
}

