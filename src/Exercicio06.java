
public class Exercicio06 {
	public static void main(String[] args) {

		int qtd = 50;
		int num[] = new int[qtd];
		System.out.print("| ");
		for (int i = 0; i < qtd; i++) {
			num[i] = i+1;
			if(num[i] % 2 != 0)
				System.out.print(num[i]+" | ");
		}
		
	}

}