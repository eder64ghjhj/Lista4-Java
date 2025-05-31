package lista4;

import java.util.Scanner;

public class Exercicio3 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a nota (0 a 100): ");
	        int nota = sc.nextInt();

	        if (nota >= 60 && nota <= 100) {
	            System.out.println("Aprovado.");
	        } else if (nota < 60 && nota >= 0) {
	            System.out.println("Reprovado.");
	        } else {
	            System.out.println("Nota inválida.");
	        }
	        sc.close();
	    }
}
