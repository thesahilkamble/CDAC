#!/bin/bash
update_num_students() {
    sed -i "s/^$1\t$2\t[0-9]*/$1\t$2\t$3/" master.txt
}
echo "Enter Batch Code:"
read batch_code
if grep -q "^$batch_code" master.txt; then
    echo "Batch found in master file."
    num_students=$(awk -v code=$batch_code '$1 == code {print $3}' master.txt)
    new_num_students=$((num_students + 1))
    update_num_students $batch_code $new_num_students
    echo "Enter RollNo, Name, Hindi Marks, Maths Marks, and Physics Marks (space-separated, e.g., 1 John 90 85 88):"
    while read -r roll_no name hindi_marks maths_marks physics_marks; do
        echo "$roll_no $name $hindi_marks $maths_marks $physics_marks" >> master.txt
    done 

    echo "Records added successfully."
else
    echo "Batch not found in master file."
fi
