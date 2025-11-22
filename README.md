Hash.java - README
Descripción

Programa en Java que lee un archivo con artistas y años, filtra los que son menores a 1970, agrega su género musical, ordena los artistas alfabéticamente y genera un archivo de salida con total y promedio de años.

Entrada

Archivo entrada_hash.txt, formato:

Artista:Año


Ejemplo:

Michael Jackson:1982
Queen:1975
ABBA:1969

Salida

Archivo salida_hash.txt, ejemplo:

Michael Jackson:1982 (Pop)
Queen:1975 (Rock)

Total: 2, Promedio: 1978


ABBA se omite porque su año es menor a 1970.

Uso

Colocar entrada_hash.txt en la misma carpeta que Hash.java.

Compilar: javac Hash.java

Ejecutar: java Hash

Revisar salida_hash.txt.
