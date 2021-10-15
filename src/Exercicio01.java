import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resposta;

		do {
			System.out.println("Digite uma nota: (Entre 0 e 10)");
			resposta = entrada.nextInt();
			if (resposta>=0 && resposta <=10) {
				System.out.println("Obrigado");
			} else {
				System.out.println("Valor inválido");
			}
		} while (resposta<=0 && resposta >=10);
		System.out.println("\n\nObrigado por utilizar nosso softawe.");
		entrada.close();
			}

		}