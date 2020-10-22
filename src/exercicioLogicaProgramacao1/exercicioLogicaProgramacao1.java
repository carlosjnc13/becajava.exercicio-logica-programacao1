package exercicioLogicaProgramacao1;
import java.util.Scanner;

public class exercicioLogicaProgramacao1 {

	public static void main(String[] args) {
	Scanner leitura = new Scanner(System.in);
	int meses;
	
	System.out.println("Digite o numero de meses:");
	meses = leitura.nextInt();
	
	meses *= 30;
	
	System.out.println("Valor de dias:" + meses);
		

	}

}
