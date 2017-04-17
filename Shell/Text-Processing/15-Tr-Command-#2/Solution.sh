#!/bin/bash
while read line; do echo "$line" | tr -d [ ] ; done
