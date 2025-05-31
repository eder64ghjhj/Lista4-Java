package lista4;

import java.util.Scanner;

public class Exercicio4 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        double num = sc.nextDouble();

	        if (num > 0) {
	            System.out.println("Número positivo.");
	        } else if (num < 0) {
	            System.out.println("Número negativo.");
	        } else {
	            System.out.println("Número zero.");
	        }
	        sc.close();
	    }
}
