import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		int qtd = 50;
		System.out.println("Informe o pre�o do p�o");
		float valorPao = entrada.nextFloat();
		
		System.out.println("Pre�o do p�o: R$ "+df.format(valorPao));
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		float preco = 0;
		for(int i = 0; i < qtd; i++ ) {
			preco = preco + valorPao;
			System.out.println((i+1)+" - R$ "+df.format(preco));
		}
		entrada.close();
	}

}