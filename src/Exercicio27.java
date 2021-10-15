import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int qtd = 300;
		float valor[] = new float[qtd];
		char opcao = 0;

		do {
			float soma = 0;
			int i = -1;
			do {
				i++;
				System.out.println("Informe o valor do " + (i + 1) + "º produto");
				valor[i] = entrada.nextFloat();
				soma = soma + valor[i];
			} while (valor[i] != 0);

			System.out.println("O valor total da compra é " + df.format(soma));
			System.out.println("Qual o valor em dinheiro que o cliente forneceu?");
			float dinheiro = entrada.nextFloat();
			float troco = dinheiro - soma;

			System.out.println("Lojas Tabajara");
			for (int j = 0; j < i; j++) {
				System.out.println("Produto " + (j + 1) + ": R$ " + df.format(valor[j]));
			}
			System.out.println("Total: R$ " + df.format(soma));
			System.out.println("Dinheiro: R$ " + df.format(dinheiro));
			System.out.println("Troco: R$ " + df.format(troco));
			
			do {
			System.out.println("Informar nova compra? (s - Sim | n - Não)");
			opcao = entrada.next().charAt(0);
			}while(opcao != 's' && opcao != 'n');

		} while (opcao == 's');
		entrada.close();

	}

}