
public class Exercicio {
	public static int somar (int n1, int n2) {
	return n1 + n2;
	}
	public static int proximo (int n1,int n2) {
	int proximo = somar(n1,n2);
	proximo = proximo +1;
	return(proximo);
	}
	public static int dobro (int n1,int n2) {
	int dobro = somar(n1,n2);
	dobro = dobro * 2;
	return(dobro);
	}
	public static void main(String[] args) {
		int somar = somar(1,8);
		int proximo = proximo(1,8);
		int dobro = dobro(1,8);
		
		System.out.println("A soma dos numeros � igual: "+ somar);
		System.out.println("O proximo n�mero �: " + proximo);
		System.out.println("O dobro do n�mero �: " + dobro);
	}
}
