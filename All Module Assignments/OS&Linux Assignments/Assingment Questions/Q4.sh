#!/bin/bash

DAY=$(date +%u)

if [ $DAY -ge 1 ] && [ $DAY -le 5 ]
then
	echo "Working Day"

else
	echo "Not Working Day"

fi

