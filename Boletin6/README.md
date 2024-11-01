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
    E -->|Si| F[Calcular area: 6 * longitud²]
    E -->|No| H
    H[Calcular volumen: longitud³]
    F --> I[Mostrar resultado del area]
    H --> J[Mostrar resultado del volumen]
    I --> K[Fin del metodo calcularCubo]
    J --> K
    K --> L[Fin del programa]

```

