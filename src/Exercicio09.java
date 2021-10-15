import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Informe o número da tabuada que deseja ver");
			num = entrada.nextInt();
		} while (num < 1 || num > 10);
		
		System.out.println("Tabuada de "+num+":");
		int mult = 0;
		for(int i = 1; i <= 10; i++) {
			mult = num*i;
			System.out.println(num+" x "+i+" = "+mult);
		}
		entrada.close();
	}

}