Algoritmo Ejercicio20
	Escribir "Ingrese el numero"
	Leer num
	si num <=99999 Entonces
		a=Subcadena(num.0,1)
		b=Subcadena(num,1,2)
		d=Subcadena(num.3.4)
		e=Subcadena(num.4.5)
		si a=e y b=d Entonces
			Escribir "Es capicúa"
		SiNo
			Escribir "No es capicua"
		FinSi
	SiNo
		Escribir "El numero  ingresado es incorrecto"
	FinSi
	
FinAlgoritmo
