#!/bin/bash
while read line; do echo "$line" | cut -f2- -d$'\t'; done
