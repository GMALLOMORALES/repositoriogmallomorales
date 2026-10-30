<<<<<<< HEAD
Algoritmo creadorcontrasenas
	habemusMayuscula <-falso
	habemusMinuscula<-falso
	habemusNumero<-falso
	definir contrasena Como Caracter
	contrasena<-" "
	
	text<-"abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789"
	//minusculas: (0,26) mayusculas(27,53) numeros(54,63)
	mientras habemusMayuscula=falso o habemusMinuscula=falso o habemusNumero=falso Hacer
		posicion<-Aleatorio(0, Longitud(text)-1)
		
		caracter <- subcadena(text, posicion, posicion)
		contrasena<- Concatenar(contrasena,caracter)
		si posicion <= 26 Entonces
			
			habemusMinuscula <- Verdadero
			
			
		FinSi
		si posicion >= 26 y posicion <= 54 Entonces
			
			habemusMayuscula <- Verdadero
			
			
		FinSi
		si posicion >=	 54 Entonces
			
			habemusNumero <- Verdadero
			
			
		FinSi
	FinMientras
	Escribir contrasena
		
	
FinAlgoritmo
=======
Algoritmo creadorcontrasenas
	habemusMayuscula <-falso
	habemusMinuscula<-falso
	habemusNumero<-falso
	definir contrasena Como Caracter
	contrasena<-" "
	
	text<-"abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789"
	//minusculas: (0,26) mayusculas(27,53) numeros(54,63)
	mientras habemusMayuscula=falso o habemusMinuscula=falso o habemusNumero=falso Hacer
		posicion<-Aleatorio(0, Longitud(text)-1)
		
		caracter <- subcadena(text, posicion, posicion)
		contrasena<- Concatenar(contrasena,caracter)
		si posicion <= 26 Entonces
			
			habemusMinuscula <- Verdadero
			
			
		FinSi
		si posicion >= 26 y posicion <= 54 Entonces
			
			habemusMayuscula <- Verdadero
			
			
		FinSi
		si posicion >=	 54 Entonces
			
			habemusNumero <- Verdadero
			
			
		FinSi
	FinMientras
	Escribir contrasena
		
	
FinAlgoritmo
>>>>>>> 0deb35c08faf1f698592da54ecea69a86bc62f29
