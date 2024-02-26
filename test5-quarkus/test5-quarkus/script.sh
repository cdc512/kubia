#!/bin/bash

# Verifica si se proporcionaron suficientes argumentos
if [ $# -ne 1 ]; then
    echo "Uso: $0 '<dependency>...</dependency>'"
    exit 1
fi

# Dependencia a agregar
dependency="$1"

# Archivo pom.xml
pom_file="pom.xml"

# Verifica si el archivo pom.xml existe
if [ ! -f "$pom_file" ]; then
    echo "El archivo $pom_file no existe."
    exit 1
fi

# Encuentra la línea que contiene '</dependencies>'
line_number=$(grep -n '</dependencies>' "$pom_file" | cut -d':' -f1)

# Agrega la dependencia antes de '</dependencies>'
if [ -n "$line_number" ]; then
    # Agrega la dependencia justo antes de la línea '</dependencies>'
    sed -i "${line_number}i $dependency" "$pom_file"
    echo "Dependencia agregada correctamente."
else
    echo "No se pudo encontrar la etiqueta </dependencies> en $pom_file."
    exit 1
fi

