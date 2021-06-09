import java.util.Scanner;
public class Ejercicio8{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int promedio;
		System.out.print("Ingrese el primer numero: ");
		numero1=scanner.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		numero2=scanner.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		numero3=scanner.nextInt();
		promedio=(numero1+numero2+numero3)/3;
		System.out.println("El promedio es: "+promedio);		
	}
}
