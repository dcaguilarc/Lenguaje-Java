# Usamos una imagen oficial de Java
FROM openjdk:17
 
# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app
 
# Copiar el archivo Java al contenedor
COPY Tarea1.java /app
 
# Compilar el archivo Java
RUN javac Tarea1.java
 
# Comando por defecto para ejecutar el programa
CMD ["java", "Tarea1"]