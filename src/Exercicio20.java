import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número de notas que você deseja adicionar");
		int qtd = entrada.nextInt();
		float soma = 0;
		for(int i = 0; i < qtd; i++) {
			System.out.println("Informe a "+(i+1)+"ª nota");
			float nota = entrada.nextFloat();
			soma = soma + nota;
		}
		float media = soma / qtd;
		System.out.println("A média é "+media);
		entrada.close();
	}
}