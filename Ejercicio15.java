import java.util.Scanner;
public class Ejercicio15{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int numero;
		System.out.print("Ingrese el numero: ");
		numero=scanner.nextInt();
		if(numero>0){
			System.out.println("El numero es positivo");
		}else if(numero<0){
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es nulo");
		}
	}
}
