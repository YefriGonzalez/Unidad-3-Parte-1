import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		double temperaturaCelsius;
		double temperaturaFahrenheit;
		System.out.println("Ingrese la temperatura en Grados Celsius");
		temperaturaCelsius=scanner.nextDouble();
		temperaturaFahrenheit=(temperaturaCelsius*(9/5))+32;
		System.out.println("La temperatura en Fahrenheit es: "+temperaturaFahrenheit);
	}
}
