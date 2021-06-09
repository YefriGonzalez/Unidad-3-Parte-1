import java.util.Scanner;
public class Ejercicio16{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		System.out.println("Ingrese el primer numero");
		numero1=scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2=scanner.nextInt();
		System.out.println("Ingrese el tercer numero");	
		numero3=scanner.nextInt();
		if(numero1>numero2 && numero1>numero3){
			System.out.println("El numero "+numero1+" es el mayor");
		} else if (numero2>numero1 && numero2>numero3){
			System.out.println("El numero "+numero2+" es el mayor");
		} else {
			System.out.println("El numero "+numero3+" es el mayor");		
		}
	}
}
