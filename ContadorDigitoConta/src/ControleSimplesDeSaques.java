import java.util.Scanner;
public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        double totalSacado = 0;

        for (int i = 1; ; i++) {
            System.out.println("Informe o valor do saque #" + i + " (ou 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações de saque encerradas.");
                break;
            }

            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido.");
                break;
            }

            if (totalSacado + valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido.");
                break;
            }

            totalSacado += valorSaque;
            double limiteRestante = limiteDiario - totalSacado;
            System.out.println("Saque de " + valorSaque + " realizado com sucesso. Limite restante: " + limiteRestante);
        }

        scanner.close();
    }
}