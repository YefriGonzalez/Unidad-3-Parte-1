Algoritmo sin_titulo
	Escribir "Ingrese el primer lado"
	Leer primerLado
	Escribir "Ingrese el segundo lado"
	Leer segundoLado
	Escribir "Ingrese el tercer lado"
	Leer lado3
	si primerLado=segundoLado o primerLado=tercerLado o segundoLado=lado3 Entonces
		Escribir "El triangulo es  isoceles"
	FinSi
	si primerLado=segundoLado=lado3 Entonces
		Escribir "El triangulo es equilatero"
	FinSi
	si primerLado<>segundoLado<>lado3 Entonces
		Escribir "El triangulo es Escaleno"
	FinSi
FinAlgoritmo
