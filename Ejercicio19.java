public class Ejercicio19{
	public static void main(String[] args){
		int numero=(int)(Math.random()*100);
		System.out.println("El numero aleatorio es: "+numero);
		if((numero%5)==0 && numero<=25){
			System.out.println("--------Correcto---------");
		} else {
			System.out.println("No es correcto");
		}
	}
}
