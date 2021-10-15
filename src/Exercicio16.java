import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números");
		int qtd = entrada.nextInt();
		float array[] = new float[qtd];
		float maior = 0;
		float menor = 0;
		float soma = 0;
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Informe o "+(i+1)+"º número");
			array[i] = entrada.nextFloat();
			if(i == 0) {
				maior = array[i];
				menor = array[i];
			}
			if(array[i] > maior)
				maior = array[i];
			if(array[i] < menor)
				menor = array[i];
			soma = soma + array[i];
		}
		
		System.out.println("O maior número é "+maior);
		System.out.println("O menor número é "+menor);
		System.out.println("A soma dos números é "+soma);
		
		entrada.close();
	}

}