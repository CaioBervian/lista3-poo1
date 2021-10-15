import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float um = 0;
		float dois = 0;
		System.out.println("Informe o primeiro número");
		um = entrada.nextInt();
		System.out.println("Informe o segundo número");
		dois = entrada.nextInt();
		
		float resultado = 1;
		for(int i = 1; i <= dois; i++) {
			resultado = resultado * um;
			
		}
		System.out.println(resultado);
		
		entrada.close();
	}

}