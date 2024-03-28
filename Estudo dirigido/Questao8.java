package Lista3;

import java.util.*; 
public class Questao8{
	    public static void main(String[] args) {
	        int[][] matriz = new int[20][10];
	        int[] somasColunas = new int[10];
	        Scanner ler = new Scanner(System.in);

	        for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 10; j++) {
	                matriz[i][j] = ler.nextInt();
	            }
	        }

	        for (int j = 0; j < 10; j++) {
	            for (int i = 0; i < 20; i++) {
	                somasColunas[j] += matriz[i][j];
	            }
	        }

	        for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 10; j++) {
	                matriz[i][j] *= somasColunas[j];
	            }
	        }

	        for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


