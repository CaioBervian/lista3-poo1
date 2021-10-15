import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int qtd = 10;
		int array[] = new int[qtd];
		
		int par = 0;
		int impar = 0;
		for(int i = 0; i < qtd; i++) {
			System.out.println("Informe um valor");
			array[i] = entrada.nextInt();
			if(array[i] % 2 == 0)
				par++;
			else {
				impar++;
			}
		}
		
		System.out.println("A quantidade de números pares é "+par);
		System.out.println("A quantidade de números impares é "+impar);
		
		entrada.close();
	}

}