import java.util.Scanner;
public class Ejercicio20{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int numero;
		int d1;
		int d2;
		int d4;
		int d5;
		System.out.print("Ingrese el numero: ");
		numero=scanner.nextInt();
		if(numero>=10000 && numero<=99999){
			String cadena=Integer.toString(numero);
			String a=cadena.substring(0,1);
			d1=Integer.valueOf(a);
			String b=cadena.substring(1,2);
			d2=Integer.valueOf(b);
			String d=cadena.substring(3,4);
			d4=Integer.valueOf(d);
			String e=cadena.substring(4,5);
			d5=Integer.valueOf(e);
			if(d1==d5 && d2==d4){
				System.out.println("-----------Es Capicúa---------------");
			} else {
				System.out.println("No es Capicúa");
			}
			
		} else {
			System.out.println("El numero que ingreso contiene la cantidad de digitos incorrectos para que este sea capicúa");
		}
	}
}
