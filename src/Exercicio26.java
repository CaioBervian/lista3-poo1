import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		int qtd = 50;
		System.out.println("Informe o preço do pão");
		float valorPao = entrada.nextFloat();
		
		System.out.println("Preço do pão: R$ "+df.format(valorPao));
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		float preco = 0;
		for(int i = 0; i < qtd; i++ ) {
			preco = preco + valorPao;
			System.out.println((i+1)+" - R$ "+df.format(preco));
		}
		entrada.close();
	}

}