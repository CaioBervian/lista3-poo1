import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o n�mero de notas que voc� deseja adicionar");
		int qtd = entrada.nextInt();
		float soma = 0;
		for(int i = 0; i < qtd; i++) {
			System.out.println("Informe a "+(i+1)+"� nota");
			float nota = entrada.nextFloat();
			soma = soma + nota;
		}
		float media = soma / qtd;
		System.out.println("A m�dia � "+media);
		entrada.close();
	}
}