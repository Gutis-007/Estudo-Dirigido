package Lista3;
import java.util.Scanner;
public class Questao2 {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            exibirMenu();
	            opcao = scanner.nextInt();

	            if (opcao >= 1 && opcao <= 5) {
	                System.out.print("Digite o primeiro número: ");
	                double num1 = scanner.nextDouble();
	                System.out.print("Digite o segundo número: ");
	                double num2 = scanner.nextDouble();

	                double resultado = 0;

	                switch (opcao) {
	                    case 1:
	                        resultado = num1 + num2;
	                        break;
	                    case 2:
	                        resultado = num1 - num2;
	                        break;
	                    case 3:
	                        resultado = num1 * num2;
	                        break;
	                    case 4:
	                        if (num2 != 0) {
	                            resultado = num1 / num2;
	                        } else {
	                            System.out.println("Erro: Divisão por zero!");
	                        }
	                        break;
	                    case 5:
	                        resultado = num1 % num2;
	                        break;
	                }

	                System.out.println("Resultado: " + resultado);
	            } else if (opcao == 9) {
	                System.out.println("Encerrando o programa.");
	            } else {
	                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
	            }
	        } while (opcao != 9);

	        scanner.close();
	    }

	    public static void exibirMenu() {
	        System.out.println("********************************************************");
	        System.out.println("********************************************************");
	        System.out.println("* 1 - Adição de dois números");
	        System.out.println("* 2 - Subtração de dois números");
	        System.out.println("* 3 - Multiplicação de dois números");
	        System.out.println("* 4 - Divisão de dois números");
	        System.out.println("* 5 - O resto da divisão (módulo) de dois números");
	        System.out.println("* 9 - Encerrar Programa");
	        System.out.println("********************************************************");
	    }
	}


