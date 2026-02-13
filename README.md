## Descripción 
Este programa en permite calcular el porcentaje de votos obtenidos por cada candidato en una elección. Primeramente, el usuario indica cuántos candidatos participan y después ingresa los votos uno por uno, así el sistema cuenta automáticamente los votos y muestra el porcentaje final de cada candidato.

## Funcionalidad
- Solicita al usuario el número total de candidatos
- Permite ingresar votos individuales indicando el número del candidato
- Valida que el número ingresado corresponda a un candidato existente
- Finaliza cuando el usuario introduce 0 como se solicitó
- Muestra los resultados en porcentaje con dos decimales(cambié println por printf porque así ya solo se imprimen dos decimales en el porcentaje) 

## Estructura
- Arreglo votos[]: guarda la cantidad de votos de cada candidato
- Variable total: lleva el conteo total de votos válidos
- Ciclo while: permite ingresar votos hasta que se escriba 0
- Ciclo for: recorre todos los candidatos para calcular sus porcentajes