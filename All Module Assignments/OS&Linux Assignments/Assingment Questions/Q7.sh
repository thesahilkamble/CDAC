#!/bin/bash

find() {
    rollno=$1
    var=$(grep -c "^$rollno:" stud.txt)
    if [ $var -eq 0 ]; then
        echo "Roll No Not Found"
        return 1
    else
        return 0
    fi
}

edit() {
    rollno=$1
    echo "Enter new name for given roll number $rollno:"
    read newname
    echo "Enter marks for 3 subjects:"
    read marks
    sed -i "/^$rollno:/ s/:.*:.*:/:$newname:$marks:/" stud.txt
    echo "Record updated successfully"
}

echo "Enter roll number to search:"
read rollno
if find "$rollno"; then
    edit "$rollno"
fi
