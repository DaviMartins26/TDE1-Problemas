
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main extends Fila{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        while (true) {
            System.out.println("\n1- Fila- Inserir elemento");
            System.out.println("2- Fila -Remover elemento");
            System.out.println("3- Ver Fila(tamanho 5)");
            System.out.println("4- Pilha - Inserir elemento");
            System.out.println("5- Pilha - Remover elemento");
            System.out.println("6- ver Pilha(tamanho 5)");
            System.out.println("7- Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Infome um Int para ser adicionado a Fila");
                    int elemento = scanner.nextInt();
                    fila.inserirElemento(elemento);
                    fila.imprimirFila();
                    //System.out.println("inicio e fim:" + fila.getInicio() +"   "+ fila.getFim()); // vendo se a fila avança
                    break;

                case 2:
                    System.out.println("Removendo o primeiro elemento:" + fila.getPrimeiro());
                    fila.removerElemento();
                    // fila.imprimirFila();
                    break;

                case 3:
                    System.out.println("Imprimindo fila");
                    fila.imprimirFila();
                    break;

                case 4:
                    System.out.println("Infome um Int para ser adicionado a Pilha");
                    int elemento2 = scanner.nextInt();
                    pilha.empilharElemento(elemento2);
                    // pilha.consultarTopo();
                    break;

                case 5:
                    System.out.println("Removendo o topo da Pilha");
                    pilha.desempilhaElemento();
                    break;

                case 6:
                    System.out.println("Imprimindo Topo da Pilha");
                    System.out.println(pilha.consultarTopo());
                    break;

                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}
