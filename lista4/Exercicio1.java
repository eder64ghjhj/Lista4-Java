package lista4;

import java.util.Scanner;

public class Exercicio1 {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int num = sc.nextInt();

	        if (num % 2 == 0) {
	            System.out.println("Número par.");
	        } else {
	            System.out.println("Número ímpar.");
	        }
	        sc.close();
	    }

}
