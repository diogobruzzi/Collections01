package colections;

public class Pessoa {
	public static String exibirMaioridade(int idade) {
		if(idade < 0) {
			throw new IllegalArgumentException("A idade n�o pode ser negativa");
		}
		if(idade < 18) {
			return "Menor de Idade";
		}
		else {
			return "Maior de Idade";
		}
	}

}
