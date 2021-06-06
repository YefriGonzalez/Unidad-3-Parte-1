Algoritmo Ejercicio18
	Escribir "Ingrese el numero"
	Leer num
	si num<=9999 Entonces
		a=Subcadena((num,0,1)
		b=Subcadena(num,1,2)
		c=Subcadena(num,2,3)
		d=Subcadena(num,3,4)
		suma=a+b+c+d
		Escribir "D1: " a ",D2: " b ",D3: " c ",D4: " d ",suma: " suma
	SiNo
		Escribir "El numero es mayor de lo permitido"
	FinSi
FinAlgoritmo
