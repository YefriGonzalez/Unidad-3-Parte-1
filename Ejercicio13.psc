Algoritmo Ejercicio13
	Escribir "Ingrese el radio"
	leer radio
	Escribir "Ingrese la altura"
	Leer altura
	p=3.1416
	si radio>0 y altura>0 Entonces
		radioEvaludado=radio
		alturaEvaluada=altura
		Volumen=p*(radioEvaludado)*(radioEvaludado)*alturaEvaluada
		Escribir"El volumen es: " Volumen
	SiNo
		Escribir "El radio no puede ser negativo"
		Escribir "La altura  no  puede ser negativa"
	FinSi
	
	
	
FinAlgoritmo
