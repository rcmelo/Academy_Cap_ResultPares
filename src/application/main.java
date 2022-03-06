package application;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, x, N;
		
		System.out.println("Quantos números você vai digitar? ");
		N = sc.nextInt();
		
		int[] vet = new int[N];
		
		for (i = 0; i < N; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("Digite um valor para x: ");
		x = sc.nextInt();

	}
}
