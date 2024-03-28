package Lista3;
import java.util.Random;
public class Questao10 {
	    public static void main(String[] args) {
	        int linhas = 20;
	        int colunas = 10;
	        int[][] matriz = new int[linhas][colunas];
	        Random random = new Random();

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matriz[i][j] = random.nextInt(100); // Gera números aleatórios entre 0 (inclusive) e 100 (exclusivo)
	            }
	        }

	        // Imprimir a matriz
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


