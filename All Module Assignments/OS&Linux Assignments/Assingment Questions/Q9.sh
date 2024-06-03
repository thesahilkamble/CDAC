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

display() {
    rollno=$1
    grep "^$rollno:" stud.txt
}

edit() {
    rollno=$1
    echo "Enter new name for roll number $rollno:"
    read newname
    echo "Enter marks for 3 subjects :"
    read marks
    sed -i "/^$rollno:/ s/:.*:.*:/:$newname:$marks:/" stud.txt
    echo "Record Upadted Successfully."
}

delete() {
    rollno=$1
    sed -i "/^$rollno:/d" stud.txt
    echo "Record Deleted Successfully."
}

if [ $# -eq 0 ]; then
    echo "Usage: $0 <roll_number>"
    exit 1
fi

rollno=$1
if find "$rollno"; then
    display "$rollno"
    echo "Do you want to delete this record? (yes/no)"
    read confirm
    case $confirm in
        [Yy]|[Yy][Ee][Ss])
            delete "$rollno"
            ;;
        *)
            echo "Record Not Deleted."
            ;;
    esac
fi 
