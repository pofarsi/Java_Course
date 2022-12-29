# Set the length of the Pomodoro in minutes
length=25

# Set the number of Pomodoros completed to 0
pomodoros=0

# Set the length of the break in minutes
break_length=5

while true; do
  # Display a message indicating that the Pomodoro has started
  echo "Pomodoro $((pomodoros+1)) has started"

  # Count down the length of the Pomodoro
  for i in $(seq $length -1 1); do
    printf "\rTime remaining: %02d:%02d" $((i/60)) $((i%60))
    sleep 1
  done

  # Display a message indicating that the Pomodoro has ended
  echo "\nPomodoro $((pomodoros+1)) has ended"

  # Increment the number of Pomodoros completed
  pomodoros=$((pomodoros+1))

  # Take a break
  echo "Taking a break for $break_length minutes..."
  sleep $((break_length*60))
done
