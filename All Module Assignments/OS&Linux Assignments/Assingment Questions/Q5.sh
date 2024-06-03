#!/bin/bash

read -p "Enter your weight in kilograms: " WEIGHT

if [ $WEIGHT -ge 30 ] && [ $WEIGHT -le 250 ]
then
        echo "Welcome to MBT Health Club"

elif [ $WEIGHT -ge 250 ]
then
        echo "You are overweight"
else
	echo "You are underweight"

fi

~        
