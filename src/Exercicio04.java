

public class Exercicio04 {
	public static void main(String[] args) {
		float populacaoA = 80000;
		int contador=0;
		float populacaoB = 200000;
		
		do {
	populacaoA = (float) (populacaoA * 1.03);
	populacaoB = (float) (populacaoB * 1.015);
			contador++;
		} while ((populacaoA<=populacaoB)); 
		System.out.println(contador + " anos.");
		
			}

		}