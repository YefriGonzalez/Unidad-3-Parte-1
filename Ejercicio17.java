import java.util.Scanner;
public class Ejercicio17{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		int lado1;
		int lado2;
		int lado3;
		
		System.out.print("Ingrese el lado 1: ");
		lado1=scanner.nextInt();
		System.out.print("Ingrese el lado 2: ");
		lado2=scanner.nextInt();
		System.out.print("Ingrese el lado 3: ");
		lado3=scanner.nextInt();
		if(lado1==lado2 | lado1==lado3 | lado2==lado3){
			System.out.println("El triangulo es Isosceles");
		} else if(lado1==lado2 && lado1==lado3 && lado2==lado3){
			System.out.println("El triangulo es Equilatero");
		} else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
			System.out.println("El triangulo es Escaleno");
		}
	}
}
