package Pratica3_2;

public class KMP {
	public static void KMP(String texto, String padrao)
    {
		System.out.println("---------------------------------------");
		System.out.println("||          Rodando no KMP!          ||");
		System.out.println("---------------------------------------");
		
		int contKMP = 0;
		int ocorrKMP = 0;
		
		
		
        // verifica��o se padr�o � nulo ou vazio
        if (padrao == null || padrao.length() == 0)
        {
            System.out.println("The padrao occurs with shift 0");
            return;
        }
 
        // verifica��o se o texto � nulo ou o menor que o do padr�o
        if (texto == null || padrao.length() > texto.length())
        {
            System.out.println("padrao not found");
            return;
        }
 
        
        
        char[] chars = padrao.toCharArray();
 
        // pr�ximo[i] armazena o �ndice da pr�xima melhor correspond�ncia parcial
        int[] proximo = new int[padrao.length() + 1];
        for (int i = 1; i < padrao.length(); i++)
        {
        	int j = proximo[i + 1];
 
            while (j > 0 && chars[j] != chars[i]) {
                j = proximo[j];
            }
 
            if (j > 0 || chars[j] == chars[i]) {
                proximo[i + 1] = j + 1;
            }
        }
 
        for (int i = 0, j = 0; i < texto.length(); i++){
        	
        	contKMP++;
        	
            if (j < padrao.length() && texto.charAt(i) == padrao.charAt(j))
            {
                if (++j == padrao.length()) {
                	System.out.println("Foram feitas " + contKMP + " compara��es at� a ocorr�ncia no �ndice " + i);
                    ocorrKMP++;
                }
            }
            else if (j > 0)
            {
                j = proximo[j];
                i--;    // j� que `i` ser� incrementado na pr�xima itera��o
            }
        }
        System.out.println("Este padr�o teve " + ocorrKMP + " ocorr�ncias");
        System.out.println("Pelo KMP, foram feitas " + contKMP + " compara��es at� o fim do texto");
    }

}