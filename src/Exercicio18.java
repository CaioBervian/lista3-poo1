import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
//
		Scanner entrada = new Scanner(System.in);
		boolean logico = false;
		int num = 0;
		
		do {
			System.out.println("Informe um número: ");
			num = entrada.nextInt();
		} while (num < 0);
		
		int vetor[] = new int[num];
		

		int k = 0;
		
		for(int j = 1; j <= num; j++) {
			if (num != j && num % j == 0 || num == 1) {
				logico = true;
				vetor[k] = j;
				k++;
			}
		}

		if (logico == false)
			System.out.println("É um número primo ");
		else {
			System.out.println("Não é um número primo ");
			System.out.print(num+" é divisível por: ");
			for(int m = 0; m < k; m++) {
				if(m != 0) System.out.print(", ");
				System.out.print(vetor[m]);
			}
		}
		entrada.close();
	}
}