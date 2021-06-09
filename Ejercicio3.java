import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
	int numero;
	int doble;
	int triple;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Ingrese el numero: ");
	numero=scanner.nextInt();
	doble=2*numero;
	triple=3*numero;
	System.out.println("El doble de "+ numero+" es: "+doble);
	System.out.println("El triple de "+ numero+" es: "+triple);
	
	}


}
