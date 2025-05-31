package lista4;

import java.util.Scanner;

public class Exercicio10 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o lado 1: ");
	        double a = sc.nextDouble();
	        System.out.print("Digite o lado 2: ");
	        double b = sc.nextDouble();
	        System.out.print("Digite o lado 3: ");
	        double c = sc.nextDouble();

	        if (a + b > c && a + c > b && b + c > a) {
	            System.out.println("Os lados formam um triângulo válido.");
	        } else {
	            System.out.println("Os lados NÃO formam um triângulo válido.");
	        }
	        sc.close();
	    }
}
