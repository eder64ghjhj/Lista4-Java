package lista4;

import java.util.Scanner;

public class Exercicio7 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int num = sc.nextInt();

	        if (num >= 10 && num <= 20) {
	            System.out.println("O número está no intervalo de 10 a 20.");
	        } else {
	            System.out.println("O número NÃO está no intervalo de 10 a 20.");
	        }
	        sc.close();
	    }
}
