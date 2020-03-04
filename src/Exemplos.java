import java.util.Scanner;

public class Exemplos {
	private static Scanner in;

	public static void main(String[] args) {
       System.out.println("Digite o numero");
		in = new Scanner( System.in );
        int num = in.nextInt();
 
	        
		ehMaiorIdade(30);
		classificar(num);
	}

	public static void ehMaiorIdade(int idade) {
		if (idade >= 18) {
			System.out.println("MAIOR DE IDADE");
		} else {
			System.out.println("MENOR DE IDADE");
		}

	}

	public static void classificar(int num) {
		if (num > 0) {
			System.out.println("Positivo");
		} else {
			if (num == 0) {
				System.out.println("ZERO");
			} else {
				System.out.println("Negativo");
			}
		}
	}

}