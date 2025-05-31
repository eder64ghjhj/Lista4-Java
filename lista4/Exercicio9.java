package lista4;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        if (letra >= 'a' && letra <= 'z') {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra é uma vogal.");
            } else {
                System.out.println("A letra é uma consoante.");
            }
        } else {
            System.out.println("Não é uma letra válida.");
        }
        sc.close();
    }
}
