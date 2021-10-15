import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = entrada.nextInt();
		
		int soma = 1;
		for(int i = 2; i <= num; i++) {
			soma = soma * i;
		}
		System.out.println(soma);
		
		entrada.close();
	}

}