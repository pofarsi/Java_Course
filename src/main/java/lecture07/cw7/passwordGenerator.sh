#!/bin/bash

# Set the length of the password
length=16

# Generate a random password
password=$(cat /dev/urandom | tr -dc 'a-zA-Z0-9!@#$%^&*()_+-' | fold -w $length | head -n 1)

# Print the password
echo "Your new password is: $password"

chmod +x generate_password.sh