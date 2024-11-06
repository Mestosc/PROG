# Ejercicios del Boletin 6
## Ejercicio 1
Nos permite mediante un metodo saber la cantidad de numeros entre un numero y otro
```mermaid
graph TD
    A[Inicio] --> B[Solicitar primer numero]
    B --> C[Solicitar segundo numero]
    C --> D[Llamar a numerosEntre con numero1 y numero2]
    D --> E{numero1 > numero2}
    E -->|Si| F[Asignar aux = numero1]
    F --> G[Asignar numero1 = numero2]
    G --> H[Asignar numero2 = aux]
    E -->|No| I[Iniciar bucle desde i = numero1+1 hasta i < numero2]
    H --> I
    I --> J[Imprimir valor de i valores entre numero1 y numero2]
    J --> I
    I --> K[Fin del bucle]
    K --> L[Fin del programa]

```
## Ejercicio 2
Nos imprime la palabra Eco... un numero n de veces
```mermaid
graph TD
    A[Inicio] --> B[Solicitar un numero]
    B --> C[Llamar al metodo eco con el numero introducido]
    C --> D[Cerrar scanner]
    D --> E[Iniciar metodo eco]
    E --> F[Iniciar bucle desde i=0 hasta i < veces]
    F --> G[Imprimir Ecoo...]
    G --> F
    F --> H[Fin del bucle]
    H --> I[Fin del metodo eco]
    I --> J[Fin del programa]

```

## Ejercicio 3
Nos solicita un caso 1 para area y 2 para volumen y la longitud y luego nos muestra area o volumen
```mermaid
graph TD
    A[Inicio] --> B[Solicitar tarea a realizar 1 para area, 2 para volumen]
    B --> C[Solicitar longitud del cubo]
    C --> D[Llamar al metodo calcularCubo con tareaHacer y longitud]
    D --> E{tareaHacer == 1}
    E -->|Si| F[Calcular area: 6 * longitud elevado a 2]
    E -->|No| H
    H[Calcular volumen: longitud elvado a 3]
    F --> I[Mostrar resultado del area]
    H --> J[Mostrar resultado del volumen]
    I --> K[Fin del metodo calcularCubo]
    J --> K
    K --> L[Fin del programa]

```

## Ejercicio 4
Introduciendo una cantidad en dias otra en horas y otra en minutos obtenemos
la cantidad total de segundos
```mermaid
graph TD
    A[Inicio] --> B[Solicitar cantidad de dias]
    B --> C[Solicitar cantidad de horas]
    C --> D[Solicitar cantidad de minutos]
    D --> E[Llamar al metodo conversionSegundos con dias, horas y minutos]
    E --> F[Calcular dias en segundos: dias * 86400]
    F --> G[Calcular horas en segundos: horas * 3600]
    G --> H[Calcular minutos en segundos: minutos * 60]
    H --> I[Sumar todos los segundos]
    I --> J[Retornar la cantidad total de segundos]
    J --> K[Mostrar el resultado en pantalla]
    K --> L[Fin del programa]

```
## Ejercicio 5
Nos muestra la diferencia en minutos de dos intervalos de tiempo en horas y minutos
```mermaid
graph TD
    A[Inicio] --> B[Solicitar la primera cantidad en horas]
    B --> C[Solicitar la primera cantidad en minutos]
    C --> D[Solicitar la segunda cantidad en horas]
    D --> E[Solicitar la segunda cantidad en minutos]
    E --> F[Llamar al metodo diferenciaMin con las horas y minutos introducidos]
    F --> G[Convertir hora1 a minutos y guardarlo en minutosHora1]
    G --> H[Convertir hora2 a minutos y guardarlo en minutosHora2]
    H --> I[Calcular totalMinutos1 como minutosHora1 + minuto1]
    I --> J[Calcular totalMinutos2 como minutosHora2 + minuto2]
    J --> K[Calcular diferenciaTotal usando condicional ternario]
    K --> L[Retornar diferenciaTotal]
    L --> M[Mostrar la diferencia en minutos]
    M --> N[Fin del programa]

```
## Ejercicio 6
Nos muestra si dos numeros son Amigos esto ocurre cuando la suma de los divisores de un numero es igual al otro numero y viceversa
```mermaid
graph TD
    A[Inicio] --> B[Solicitar primer numero]
    B --> C[Solicitar segundo numero]
    C --> D[Llamar al metodo numerosAmigos]
    D --> E[Calcular suma de divisores de primerNumero]
    E --> F[Calcular suma de divisores de segundoNumero]
    F --> G[Verificar si sumaDivisores1 es igual a segundoNumero y sumaDivisores2 es igual a primerNumero]
    G --> H{Son amigos?}
    H -- Si --> I[Mostrar que los numeros son amigos]
    H -- No --> J[Mostrar que no son amigos]
    I --> K[Fin]
    J --> K[Fin]

```

Esto es una prueba de concepto de diagrama de flujo en Mermaid usando ChatGPT