# Hash.java 

## Descripción
`Hash.java` es un programa que :

- Lee un archivo con artistas y sus años de lanzamiento.  
- Filtra los artistas con año menor a 1970.  
- Agrega el género musical de cada artista según un mapa predefinido.  
- Ordena los artistas alfabéticamente.  
- Genera un archivo de salida con la información completa, total de artistas procesados y promedio de años.

---

## Entrada
Archivo: `entrada_hash.txt`  
Formato por línea:
Artista:Año

**Ejemplo:**

> Nota: ABBA se omite porque su año es menor a 1970.

---

## Salida
Archivo: `salida_hash.txt`  

**Ejemplo:**

Michael Jackson:1982 (Pop)
Queen:1975 (Rock)

Total: 2, Promedio: 1978

- Cada línea muestra el artista, año y género musical.  
- `Total` indica el número de artistas procesados después del filtrado.  
- `Promedio` es el promedio de los años incluidos.

---

## Detalles Técnicos
- Estructura de datos principal: `HashMap<String, Integer>` para artista y año.  
- Filtrado: se ignoran artistas con año < 1970.  
- Ordenamiento: alfabético por artista usando `Collections.sort()`.  
- Géneros: definidos en `Map<String, String>` (`genreAPI`).  
- Archivos: lectura con `BufferedReader`, escritura con `BufferedWriter`.

---

## Uso
1. Colocar `entrada_hash.txt` en la misma carpeta que `Hash.java`.  
2. Compilar:   Hash.java

