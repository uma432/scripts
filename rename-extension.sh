#!/bin/sh

# renames all .txt files from the current folder to .csv

for file in *.txt
do
  mv "$file" "${file%.txt}.csv"
done
