import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int HI, HF;
		int duracao;
		
		System.out.println("Hora inicial: ");
		HI = sc.nextInt();
		System.out.println("Hora final: ");
		HF = sc.nextInt();
		
		if (HI < HF) {
			duracao = HI - HF;
	}
		else {
			duracao = HF - HI;
		}
		
		System.out.println("O jogo durou " + duracao + "hrs.");

		sc.close();
		
	}}
