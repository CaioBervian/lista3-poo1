import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int um = 0;
		int dois = 0;
		int soma = 0;
		System.out.println("Informe o primeiro n�mero");
		um = entrada.nextInt();
		System.out.println("Informe o segundo n�mero");
		dois = entrada.nextInt();
		int aux = 0;
		int aux2 = 0;
		if (um > dois) {
			aux = dois;
			aux2 = um;
		} else {
			aux = um;
			aux2 = dois;
		}
		for (int i = (aux+1); i < aux2; i++) {
			System.out.println(i);
			soma = soma + i;
		}
		System.out.println("A soma do intervalo � "+soma);
		
		entrada.close();
	}

}