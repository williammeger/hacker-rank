#!/bin/bash
read count;
sum=0;
for ((i=0; i<$count; i++)); do
    read temp
    ((sum += temp))
done
printf "%.3f" $(echo "scale = 4; $sum / $count" | bc)
