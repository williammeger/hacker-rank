#!/bin/bash
while read line; do echo "$line" | cut -f1-3 -d' '; done
