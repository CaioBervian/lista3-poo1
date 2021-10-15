
public class Exercicio05 {

	public static void main(String[] args) {
		int qtd = 20;
		int num[] = new int[qtd];
		
		
		for (int i = 0; i < qtd; i++) {
			num[i] = i+1;
			System.out.println(num[i]);
		}
		
		
		System.out.print(" | ");
		for (int i = 0; i < qtd; i++) {
			System.out.print(num[i]+" | ");
		}
		
	}
}