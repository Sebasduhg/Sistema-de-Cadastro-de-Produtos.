import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> listadeprodutos = new ArrayList<>();
        boolean executado = true;

        while (executado) {
            System.out.println("\n===MENU DE INTERAÇÕES");
            System.out.println("1 PARA CADASTRAR PRODUTOS");
            System.out.println("2 PARA VER A LISTA DE PRODUTOS");
            System.out.println("3 PARA PESQUISAR UM PRODUTO");
            System.out.println("4 PARA REMOVER UM PRODUTO");
            System.out.println("5 PARA SAIR");

            System.out.print("\nDigite a opçao desejada: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade de produtos que deseja cadastrar: ");
                    int quantidadeprodutos = sc.nextInt();
                    for (int i = 0; i < quantidadeprodutos; i++) {
                        Produto produto = new Produto();

                        System.out.println("Digite o nome do produto: ");
                        produto.nome = sc.next();

                        System.out.println("Digite o preço do produto: ");
                        produto.preco = sc.nextDouble();

                        System.out.println("Digite a quantidade do produto: ");
                        produto.quantidade = sc.nextInt();

                        listadeprodutos.add(produto);
                    }
                    break;

                case 2:
                    for (Produto produto : listadeprodutos) {
                        produto.apresentar();
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do produto desejado: ");
                    String nomebusca = sc.next();

                    for (Produto produto : listadeprodutos) {
                        if (produto.nome.equalsIgnoreCase(nomebusca)) {
                            produto.apresentar();
                        } else {
                            System.out.println("Não existe esse produto!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome do produto que deseja remover: ");
                    String nomeremover = sc.next();

                    for (int i = 0; i < listadeprodutos.size(); i++) {
                        if (listadeprodutos.get(i).nome.equalsIgnoreCase(nomeremover)) {
                            listadeprodutos.remove(i);
                            System.out.println("Produto removido!");
                        } else {
                            System.out.println("Esse produto não existe");
                            break;
                        }
                    }
                    break;

                case 5:
                    executado = false;
                    break;
            }
        }

    }
}