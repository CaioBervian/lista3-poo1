import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome ;
		int idade ;
		float salario;
		String sexo ;
		String estado;
		
		do {
			System.out.println("Digite um nome");
			nome = entrada.nextLine();
		} while (nome.length()<=3 ); 
		
		
		do {
			System.out.println("Digite a idade");
			idade = entrada.nextInt();
		} while (idade> 150 || idade<0 ); 
		
		do {
			System.out.println("Digite o salário");
			salario = entrada.nextFloat();
		} while (idade<=0); 
		entrada.nextLine();
		do {
			System.out.println("Digite o sexo");
			sexo = entrada.nextLine();
		} while (!("m".equalsIgnoreCase(sexo) || "f".equalsIgnoreCase(sexo)) ); 
		
		do {
			System.out.println("Digite o estado civil");
			estado = entrada.nextLine();
		} while (!("s".equalsIgnoreCase(estado) || "c".equalsIgnoreCase(estado) || "v".equalsIgnoreCase(estado) || "d".equalsIgnoreCase(estado))); 
		
		
		System.out.println("Nome: " + nome + ",idade: "+idade+ " ,salário: R$" + salario + ",sexo: " +sexo+ " ,estado civil: " + estado);
		
		entrada.close();
			}

		}