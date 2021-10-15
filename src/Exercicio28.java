import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float temp = 0;
		float maior = 0;
		float menor = 0;
		float soma = 0;
		char opcao = 0;
		int i = 0;
		do {
			i++;
			System.out.println("Informe a " +i+ " temperatura ");
			temp = entrada.nextInt();
			do {
				System.out.println("Informar mais uma temperatura? " + "(s - Sim | n - Não)");
				opcao = entrada.next().charAt(0);
			} while (opcao != 's' && opcao != 'n');
			if (i == 1) {
				maior = temp;
				menor = temp;
			} else {
				if (temp > maior)
					maior = temp;
				if (temp < menor)
					menor = temp;
			}
			soma = soma + temp;

		} while (opcao == 's');
		
		float media = soma / i;
		System.out.println("A maior temperatura é "+maior);
		System.out.println("A menor temperatura é "+menor);
		System.out.println("A media das temperaturas é "+media);

		entrada.close();
	}

}