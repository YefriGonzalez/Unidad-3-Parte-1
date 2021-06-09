import java.util.Scanner;
public class Ejercicio13{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		double radio;
		double altura;
		double volumen;
		System.out.print("Ingrese el radio: ");
		radio=scanner.nextDouble();
		System.out.print("Ingrese la altura: ");
		altura=scanner.nextDouble();
		if(radio>0 && altura>0){
			volumen=Math.PI*radio*altura;
			System.out.println("El volumen del clindro es: "+volumen+" U³");
		} else {
			System.out.println("Sus datos son negativos, debe ingresar datos positivos");
		}
	}
}
