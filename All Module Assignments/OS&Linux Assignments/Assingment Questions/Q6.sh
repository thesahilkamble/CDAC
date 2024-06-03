#!/bin/bash

TIME=`date +%H`

if [ $TIME -ge 00 ] && [ $TIME -le 12 ]
then
        echo "Good Morning!!"

elif [ $TIME -ge 12 ] && [ $TIME -le 17 ]
then
        echo "Good Afternoon!!"

elif [ $TIME -ge 17 ] && [ $TIME -le 20 ]
then
	echo "Good Evening!!"
else
	echo "Good Night!!"

fi


