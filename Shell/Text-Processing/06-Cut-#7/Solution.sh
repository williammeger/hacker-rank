#!/bin/bash
while read line; do echo "$line" | cut -f4 -d' '; done
