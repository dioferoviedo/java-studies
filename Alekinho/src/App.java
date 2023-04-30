import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome; ");
        nome = sc.nextLine();

        System.out.println("Olá, " + nome);

    }
}
