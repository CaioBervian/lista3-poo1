import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String senha;
	String nome;
	
	System.out.println("Digite um nome de usu�rio");
	nome = entrada.nextLine();
	
	System.out.println("Digite uma senha");
	senha = entrada.nextLine();
	
	while (nome.equalsIgnoreCase(senha)) {
		System.out.println("ERRO");
		System.out.println("Digite outra senha,n�o pode ser igual ao nome de usu�rio");
		senha = entrada.nextLine();
	} 
	entrada.close();
		}

	}