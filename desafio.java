import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV minhaTV = new TV();  // Criação do objeto TV
        
        // Mensagem de boas-vindas
        System.out.println("Bem-vindo ao controle remoto da TV!");
        
        while (true) {
            // Exibir o status atual da TV
            minhaTV.exibirStatus();
            
            // Menu de opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Mudar Canal");
            System.out.println("2. Aumentar Volume");
            System.out.println("3. Diminuir Volume");
            System.out.println("4. Sair");
            
            // Lendo a escolha do usuário
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1: // Mudar canal
                    System.out.print("Digite o número do novo canal (1 a 100): ");
                    int novoCanal = scanner.nextInt();
                    minhaTV.mudarCanal(novoCanal);
                    break;
                case 2: // Aumentar volume
                    minhaTV.aumentarVolume();
                    break;
                case 3: // Diminuir volume
                    minhaTV.diminuirVolume();
                    break;
                case 4: // Sair
                    System.out.println("Saindo... Até logo!");
                    scanner.close();
                    return;  // Finaliza o programa
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
