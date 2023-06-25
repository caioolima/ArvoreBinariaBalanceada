public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int[] elementos = {1, 2, 4, 5, 3, 6};

        for (int i = 0; i < elementos.length; i++) {
            arvore.adicionar(elementos[i]);
        }

        System.out.println("Estrutura da árvore:");
        arvore.mostrarArvore();
    }
}
