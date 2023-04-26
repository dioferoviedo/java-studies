import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-viundo! \nPor favor, insira o número de agência: ");
        String agencia = sc.nextLine();
        System.out.println();

        System.out.println("Por gentileza, digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.println();

        System.out.println("Agora, digite seu nome e sobrenome: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        System.out.println();

        System.out.println("Por favor, insira seu saldo atual: ");
        double saldo = sc.nextDouble();
        System.out.println();


        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
