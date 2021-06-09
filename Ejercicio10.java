import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		double base;
		double altura;
		double perimetro;
		double area;
		System.out.print("Ingrese la base: ");
		base=scanner.nextDouble();
		System.out.print("Ingrese la altura: ");
		altura=scanner.nextDouble();
		perimetro=2*base+2*altura;
		area=base*altura;
		System.out.println("El perimetro es: "+perimetro);
		System.out.println("El area es: "+area);
	}
}
