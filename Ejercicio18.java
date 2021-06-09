import java.util.Scanner;
public class Ejercicio18{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int numero;
		int suma;
		int d1;
		int d2;
		int d3;
		int d4;
		System.out.print("Ingrese el numero: ");
		numero=scanner.nextInt();
		if(numero<=9999 && numero>=1000){
			String cadena=Integer.toString(numero);
			String a=cadena.substring(0,1);
			d1=Integer.valueOf(a);
			String b=cadena.substring(1,2);
			d2=Integer.valueOf(b);
			String c=cadena.substring(2,3);
			d3=Integer.valueOf(c);
			String d=cadena.substring(3,4);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+",D2: "+d2+",D3: "+d3+",D4: "+d4+"\nSuma: "+suma);
		} else if(numero<=999 && numero>=100){
			String cadena=Integer.toString(numero);
			d1=0;
			String b=cadena.substring(0,1);
			d2=Integer.valueOf(b);
			String c=cadena.substring(1,2);
			d3=Integer.valueOf(c);
			String d=cadena.substring(2,3);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+",D2: "+d2+",D3: "+d3+",D4: "+d4+"\nSuma: "+suma);
		} else if(numero<=99 && numero>=0){
			String cadena=Integer.toString(numero);
			d1=0;
			d2=0;
			String c=cadena.substring(0,1);
			d3=Integer.valueOf(c);
			String d=cadena.substring(1,2);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+",D2: "+d2+",D3: "+d3+",D4: "+d4+"\nSuma: "+suma);
		} else if (numero<=9 && numero>=0){
			String cadena=Integer.toString(numero);
			d1=0;
			d2=0;
			d3=0;
			String d=cadena.substring(1,2);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+",D2: "+d2+",D3: "+d3+",D4: "+d4+"\nSuma: "+suma);
		} 
	}
}
