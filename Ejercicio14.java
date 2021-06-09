import java.util.Scanner;
public class Ejercicio14{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int dividendo;
		int divisor;
		System.out.print("Ingrese el primer numero: ");
		divisor=scanner.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		dividendo=scanner.nextInt();
		if((dividendo%divisor)==0){
			System.out.println("------Es divisble-------");
		} else {
			System.out.println("No es divisble");
		}
	}
}
