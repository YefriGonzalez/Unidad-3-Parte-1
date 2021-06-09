import java.util.Scanner;
public class Ejercicio11{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double centimetros;
		double yardas;
		double metros;
		double pulgadas;
		double pies;
		
		System.out.print("Ingrese la distancia en Centimetros: ");
		centimetros=scanner.nextDouble();
		yardas=centimetros*(1/91.44);
		metros=centimetros*0.01;
		pulgadas=centimetros*(1/2.54);
		pies=centimetros*(1/30.48);
		System.out.println("Centimetros: "+centimetros);
		System.out.println("Yardas: "+yardas);
		System.out.println("Pulgadas: "+pulgadas);
		System.out.println("Metros: "+metros);
		System.out.println("Pies: "+pies);
		
	}
}
