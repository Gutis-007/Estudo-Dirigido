package Lista3;
import java.util.Scanner;
public class Questao5 {
	    public static void main(String[] args) {
	        double []vsal;
	        double []nsal;
	        double reaj;
	        nsal = new double [200];
	        vsal = new double [200];
	        int cont=1;
	        vsal[0] = 1;
	 
	        while (vsal[(cont-1)]!= -1 ){
	            System.out.println ("Entre com o valor de salarios:" +1);
	            vsal[cont] = new Scanner(System.in).nextDouble();
	            cont= cont+1;
	        }
	        System.out.println ("Entre com o valor do reajuste:" +1);
	        reaj= new Scanner(System.in).nextDouble();
	        for (int a=1; a<=(cont-2); a++ ){
	            nsal[a]= ((reaj*vsal[a])/100)+ vsal[a];
	            System.out.println ("Salario(s) com Reajuste:" + nsal[a]);
	        }
	 
	    }
	 
	}

