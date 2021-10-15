import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tabuada = 0;
		int comeco = 0;
		int fim = 0;
		do {
			System.out.print("Montar a tabuada de: ");
			tabuada = entrada.nextInt();
		} while (tabuada < 1 || tabuada > 10);
		do {
			System.out.print("Começar por: ");
			comeco = entrada.nextInt();
		} while (comeco < 1 || comeco > 10);
		do {
			System.out.print("Terminar em: ");
			fim = entrada.nextInt();
		} while (fim < 1 || fim > 10);
		
		int aux = 0;
		if(comeco > fim) {
			aux = comeco;
			comeco = fim;
			fim = aux;
		}
		
		System.out.println("Tabuada de "+tabuada+":");
		int mult = 0;
		for(int i = comeco; i <= fim; i++) {
			mult = tabuada * i;
			System.out.println(tabuada+" x "+i+" = "+mult);
		}
		
		entrada.close();
	}

}