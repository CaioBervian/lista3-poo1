import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Especificação    Código Preço");
		System.out.println(
				"Cachorro Quente  100    R$ 1,20 \nBauru Simples    101    R$ 1,30 \nBauru com ovo    102    R$ 1,50 \nHambúrguer       103    R$ 1,20 \nCheeseburguer    104    R$ 1,30 \nRefrigerante     105    R$ 1,00");
		int cod[] = new int[10];
		int qtd[] = new int[10];
		int i = -1;
		float preco = 0;
		float total = 0;

		do {
			i++;
			do {
				System.out.println("\nInforme o " + (i + 1) + "º código:");
				cod[i] = entrada.nextInt();
			} while ((cod[i] < 100 || cod[i] > 105) && cod[i] != 0);
			if (cod[i] != 0) {
				System.out.println("Informe a quantidade: ");
				qtd[i] = entrada.nextInt();
			}
		} while (cod[i] != 0);

		i = -1;
		System.out.println("Preços: ");
		do {
			i++;
			if (cod[i] != 0) {
				if (cod[i] == 100) {
					preco = qtd[i] * (float) 1.20;
					System.out.println("Cachorro Quente: R$ " + preco);
				} else {
					if (cod[i] == 101) {
						preco = qtd[i] * (float) 1.30;
						System.out.println("Bauru Simples: R$ " + preco);
					} else {
						if (cod[i] == 102) {
							preco = qtd[i] * (float) 1.50;
							System.out.println("Bauru com ovo: R$ " + preco);
						} else {
							if (cod[i] == 103) {
								preco = qtd[i] * (float) 1.20;
								System.out.println("Hambúrguer: R$ " + preco);
							} else {
								if (cod[i] == 104) {
									preco = qtd[i] * (float) 1.30;
									System.out.println("Cheeseburguer: R$ " + preco);
								} else {
									preco = qtd[i] * (float) 1.00;
									System.out.println("Refrigerante: R$ " + preco);
								}
							}
						}
					}
				}
			}
			total = total + preco;
		} while (cod[i] != 0);

		System.out.println("\nTotal: R$ " + total);
		entrada.close();
	}

}