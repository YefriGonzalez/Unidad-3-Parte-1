import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int numero;
		int cuadrado;
		int cubo;
		
		System.out.print("Escriba el numero: ");
		numero=scanner.nextInt();
		cuadrado=(numero*numero);
		cubo=(numero*numero*numero);
		System.out.println("El cuadrado de "+numero+" es: "+cuadrado);
		System.out.println("El cubo de "+numero+" es: "+cubo);
	}
}
