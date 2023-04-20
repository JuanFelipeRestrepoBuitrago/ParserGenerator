# Taller Lenguajes Formales y Compiladores

Integrantes:

- Juan Felipe Restrepo Buitrago

# Manual de Usuario

Este proyecto esta desarollado con la librería JavaCC, la cual, a partir de una gramática, genera parsers de tipo top-down. Aunque la librería trabaja especialmente con gramáticas tipo LL(1), ya tiene la capacidad de eliminar ambiguedades y poder trabajar incluso con gramáticas que no son LL(1).

Contenido del Proyecto:

Todo lo que contiene el proyecto se encuentra en la carpeta "src", excepto por el archivo jar de JavaCC que se encuentra en el directorio principal del proyecto. Dentro de la carpeta de "src", hay 3 directorios diferentes, cada uno de ellos es para una gramática en específico. El primer directorio trabaja con la gramática de operaciones matemáticas, el segundo es una gramática LL(1) que saque de "https://slideplayer.es/slide/1479999/" y la última es la gramática de los parentesis, corchetes y llaves balanceados.
Cada uno de los directorios contiene lo siguiente:
Grammar.jj: Archivo donde se declara la gramática, el cual fue hecho por mí.
Main.java: Archivo main que ejecuta las acciones de verificación, también hecho por mí.
CompilarGramatica.bat: Archivo que al ejecutarse, ejecuta un comando por consola que autogenera los archivos java necesarios para el parser.
grammar.txt: Archivo con la gramática que analiza dicho parser.
test.txt: Archivo con series de string para evaluar si son aceptados por el parser.

¿Cómo Usar el Proyecto?

Todo lo que tiene que hacer es ejecutar el archivo main dentro de uno de los 3 directorios mencionados anteriormente, según la gramática que quiera analizar. Si quiere analizar primera gramática, debe ejecutar el Main.java que esta en el directorio Analizador1, si quiere la segunda, el Main.java de Analizador2 y si quiere la tercera y última, el Main.java de Analizador3.
