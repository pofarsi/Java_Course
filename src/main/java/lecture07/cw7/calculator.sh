#!/bin/bash

# Check that there are exactly 3 arguments
if [ $# -ne 3 ]; then
  echo "Usage: calculator.sh NUMBER OPERATOR NUMBER"
  exit 1
fi

# Extract the operands and operator from the arguments
operand1=$1
operator=$2
operand2=$3

# Perform the calculation
case $operator in
  "+") result=$((operand1 + operand2)) ;;
  "-") result=$((operand1 - operand2)) ;;
  "*") result=$((operand1 * operand2)) ;;
  "/") result=$((operand1 / operand2)) ;;
  *) echo "Invalid operator"
     exit 1
     ;;
esac

# Print the result
echo "Result: $result"


#chmod +x calculator.sh
#
#./calculator.sh NUMBER OPERATOR NUMBER
#
#./calculator.sh 2 + 3
