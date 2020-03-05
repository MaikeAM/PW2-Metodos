
public class ExemplosComRetorno {

	public static void main(String[] args) {
		String nome = concatenar ("Maike","Morais");
		int tamanho = tamanhoNomeCompleto ("Maike","Morais");
		System.out.println("Nome: "+ nome);
		System.out.println("Qtde: "+ tamanho + " Caracteres");
	}

	public static String concatenar(String nome, String sobrenome) {
		return nome + " " + sobrenome;
	}

	public static int tamanhoNomeCompleto (String nome, String sobrenome) {
		String nomeCompleto = concatenar(nome, sobrenome);
		return nomeCompleto.length();
	}
}