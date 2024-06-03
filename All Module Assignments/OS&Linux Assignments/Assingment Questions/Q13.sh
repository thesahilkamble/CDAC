#!/bin/bash

s1="Sahil"
s2="Kamble"

concatenate(){
    echo "$1 $2"
}
concatenate $s1 $s2

length(){
    echo "${#1}"
}
length $s2

compare(){
    s1=$1
    s2=$2
    if [ $s1 == $s2 ]; then
        echo "String are same"
    else
        echo "Strings are not same"
    fi
}
compare $s1 $s2

reverse(){
    rev <<< $1
}
reverse $s1

palindrome(){
    s1=$1
    s2=${s1,,}
    reve=$(reverse $s1)
    reve1=${reve,,}
    if [ $s2 == $reve1 ]; then
        echo "Palindrome"
    else
        echo "Not Plaindrome"
    fi
}
palindrome tat
