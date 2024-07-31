#!/bin/bash

read -p "Enter the filename to check: " filename

if [ ! -e "$filename" ]; then
    echo "File does not exist."
    exit 1
fi

if [ -r "$filename" ]; then
    echo "The file '$filename' is readable."
else
    echo "The file '$filename' is not readable."
fi