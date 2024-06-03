#!/bin/bash
sed -i '1, 3 s/|/:/g' EmpData.txt 

sed -i 's/|/:/g' EmpData.txt 
sed -i '1i\TechM Employees' EmpData.txt 
sed -n '/director/p' EmpData.txt > directors.txt
sed -n '/d.g.m/p' EmpData.txt > dgm.txt
sed -n '/g.m/p' EmpData.txt > gm.txt
sed -i '1, 4 w Empupdate.txt' EmpData.txt
sed -i 's/account/accounts/g' EmpData.txt 
sed -n '/g.m/!p' EmpData.txt
sed G EmpData.txt