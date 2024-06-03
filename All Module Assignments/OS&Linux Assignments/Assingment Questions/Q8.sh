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
    newname=$2
    marks=$3
    sed -i "/^$rollno:/ s/:.*:.*:/:$newname:$marks:/" stud.txt
    echo "Record Upadted Successfully."
}

if [ $# -eq 0 ]; then
    echo "Usage: $0 <roll_number>"
    exit 1
fi

rollno=$1
if find "$rollno"; then
    echo "Enter new name for roll number $rollno:"
    read newname
    echo "Enter marks for 3 subjects :"
    read marks
    edit "$rollno" "$newname" "$marks"
fi 
