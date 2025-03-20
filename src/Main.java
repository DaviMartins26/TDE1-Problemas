
import java.util.Scanner;

public class Main extends Fila{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();

        while (true) {
            System.out.println("\n1- Inserir elemento");
            System.out.println("2- Remover elemento");
            System.out.println("3- Ver fila(tamanho 5 elementos)");
            System.out.println("4- Sair");
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
                    fila.imprimirFila();
                    break;

                case 3:
                    System.out.println("Imprimindo fila");
                    fila.imprimirFila();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}
