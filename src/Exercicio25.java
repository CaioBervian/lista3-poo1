import java.text.DecimalFormat;

public class Exercicio25 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.00");
		int qtd = 50;
		System.out.println("Lojas Quase Dois - Tabela de preços");
		float preco = 0;
		for(int i = 0; i < qtd; i++ ) {
			preco = preco + (float)1.99;
			System.out.println((i+1)+" - R$"+df.format(preco));
		}
	}
}