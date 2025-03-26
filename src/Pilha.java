public class Pilha {
    private int max = 5;
    private int topo = -1;
    private  int pilha[];

    public Pilha() {
        pilha = new int[max];
    }

    public boolean pilhaVazia(){
        return (topo == -1);
    }
    public boolean pilhaCheia(){
        return (topo == max -1 );
    }

    public void empilharElemento(int elemento){
        if (pilhaCheia()){
            System.out.println("Pilha Cheia");
            return;
        } else {
            topo = topo +1;
            pilha[topo] = elemento;
        }
    }

    public int desempilhaElemento(){
        if (pilhaVazia()){
            System.out.println("Erro:Pilha vazia");
        } else {
            int elemento = pilha[topo];
            topo = topo -1;
            return elemento;
        }
        return 0; // intele pediu isso
    }

    public int consultarTopo() {
        if (pilhaVazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        return pilha[topo];
    }
}

