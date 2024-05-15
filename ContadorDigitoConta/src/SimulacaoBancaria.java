import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");

            // Solicita ao usuário que escolha uma opção
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            // Implementa as condições necessárias para avaliar a opção escolhida
            switch (opcao) {
                case 1:
                    // Solicita o valor a ser depositado
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    // Atualiza o saldo após o depósito
                    saldo += deposito;
                    System.out.println("Depósito de " + deposito + " realizado com sucesso.");
                    break;
                case 2:
                    // Solicita o valor a ser sacado
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    // Verifica se há saldo suficiente para o saque
                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.println("Saque de " + saque + " realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;
                case 3:
                    // Exibe o saldo atual da conta
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    // Encerra o programa
                    System.out.println("Encerrando o programa.");
                    scanner.close(); // Fechar o scanner antes de encerrar o programa
                    System.exit(0);
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
