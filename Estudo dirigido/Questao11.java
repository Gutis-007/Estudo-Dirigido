package Lista3;
import java.util.ArrayList;
import java.util.Scanner;
public class Questao11 {
	    public static void main(String[] args) {
	        ArrayList<Integer> valores = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Informe 5 valores inteiros:");

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Informe o valor " + (i + 1) + ": ");
	            int valor = scanner.nextInt();
	            valores.add(valor);
	        }

	        System.out.println("Elementos do ArrayList:");

	        for (int i = 0; i < valores.size(); i++) {
	            System.out.println("Elemento " + (i + 1) + ": " + valores.get(i));
	        }
	    }
	}


