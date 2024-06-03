#!bin/bash
<<Q1
First Question of Assignment to print *
Q1



for((i=0;i<5;i++))

do
     for((j=1;j<=i;j++))
     do
	     echo -n "*"
     done
     #new line
     echo ""
done
