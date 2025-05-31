package lista4;

import java.util.Scanner;

public class Exercicio8 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int num = sc.nextInt();

	        if (num % 3 == 0 && num % 5 == 0) {
	            System.out.println("O número é divisível por 3 e por 5.");
	        } else {
	            System.out.println("O número NÃO é divisível por 3 e por 5.");
	        }
	        sc.close();
	    }
}
