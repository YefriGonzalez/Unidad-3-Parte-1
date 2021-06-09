import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int numero;
		int aumentadoEn1;
		System.out.print("Ingrese el numero: ");
		numero=scanner.nextInt();
		aumentadoEn1=numero+1;
		System.out.println("El numero siguiente de " +numero+" es: "+aumentadoEn1);
	}
}
