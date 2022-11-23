package Pratica3_2;

public class ForcaBruta {
	
	static void buscarBruto(String texto, String padrao) {
		
		System.out.println("---------------------------------------");
		System.out.println("||      Rodando na força bruta!      ||");
		System.out.println("---------------------------------------");
		
		int M = padrao.length();
		int N = texto.length();
		int i, j;
		int contBrut = 0;
		int ocorrBrut = 0;
		for (i = 0; i <= N - M; i++) {
			for (j = 0; j < M; j++) {
				contBrut++;
				if (texto.charAt(i + j) != padrao.charAt(j))
					break;}
		if (j == M) {
			ocorrBrut++;
			System.out.println("Foram feitas " + contBrut + " comparações até a ocorrência no índice " + i);
			}
		}
		System.out.println("Este padrão teve " + ocorrBrut + " ocorrências");
		System.out.println("Pela força bruta, foram feitas " + contBrut + " comparações até o fim do texto");
	}
}
