package Pratica3_2;

public class ForcaBruta {
	
	static void buscarBruto(String texto, String padrao) {
		
		System.out.println("---------------------------------------");
		System.out.println("||      Rodando na for�a bruta!      ||");
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
			System.out.println("Foram feitas " + contBrut + " compara��es at� a ocorr�ncia no �ndice " + i);
			}
		}
		System.out.println("Este padr�o teve " + ocorrBrut + " ocorr�ncias");
		System.out.println("Pela for�a bruta, foram feitas " + contBrut + " compara��es at� o fim do texto");
	}
}
