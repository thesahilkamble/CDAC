#!/bin/bash

read -p "Enter Roll Number: " rollno

if grep -q "^$rollno" students.txt ; then
    echo "Roll no exists." 1>> log.txt
    grep "^$rollno" students.txt 1>> log.txt
    exit
fi

    read -p "Enter Name: " name
    read -p "Enter marks in Hindi: " Marks_Hindi
    read -p "Enter marks in Maths: " Marks_Maths
    read -p "Enter marks in Physics: " Marks_Physics

if (( $Marks_Hindi < 1|| $Marks_Hindi > 99|| $Marks_Maths < 1|| $Marks_Maths > 99|| $Marks_Physics < 1|| $Marks_Physics > 99 )); then
    echo "marks out of range" >> log.txt
    exit
fi

total=$((Marks_Hindi + Marks_Maths + Marks_Physics))
percentage=$((total/3))
if ((percentage < 35)); then
    grade="fail"
elif (( percentage >= 35 && percentage < 50 )); then
    grade="third"
elif (( percentage >= 50 && percentage < 60 )); then
    grade="Second"
elif (( percentage >= 60 && percentage < 75 )); then
    grade="first"
else
    grade="Distinction"
echo "Total: $total"
echo "Percentage: $percentage"
fi
