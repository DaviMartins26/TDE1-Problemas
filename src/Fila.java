public class Fila extends Pilha{
    private int inicio = 0;
    private int fim = 0;
    private int tamanho = 5;
    private int fila[];

    public Fila(){
        fila = new int[tamanho];
    }

    public boolean filaVazia() {
        return (inicio == fim);
    }

    public boolean filaCheia() {
        return ((fim + 1) % tamanho == inicio);
    }

    public void inserirElemento(int elemento) {
        if (filaCheia()) {
            System.out.println("Erro:Fila Cheia");
        } else {
            fila[fim] = elemento;
            fim = (fim + 1) % tamanho;
        }
    }

    public void removerElemento() {
        if (filaVazia()) {
            System.out.println("Erro:Fila Vazia");
        } else {
            int elemento = fila[inicio];
            inicio = (inicio + 1) % tamanho;
        }
    }

    public void imprimirFila() {
        if (filaVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.print("Fila Atual: ");
        for (int i = inicio; i != fim; i = (i + 1) % tamanho) {
            System.out.print(fila[i] + " ");
        }
    }
    public int getPrimeiro(){
        int primeiro = fila[inicio];
        return primeiro;
    }

    public int getInicio(){
        return inicio;
    }
    public int getFim(){
        return fim;
    }
}


