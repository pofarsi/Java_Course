#!/bin/bash

# Declare an array to store the to-do tasks
declare -a todo_list

# Function to add a new task
add_task() {
  # Prompt the user for the task description
  read -p "Enter task description: " task_description

  # Append the task to the to-do list array
  todo_list+=("$task_description")
}

# Function to show all tasks
show_tasks() {
  # Print the header
  printf "%-5s %s\n" "ID" "Task"

  # Print each task in the to-do list array
  for ((i=0; i<${#todo_list[@]}; i++)); do
    printf "%-5s %s\n" "$i" "${todo_list[$i]}"
  done
}

# Function to mark a task as done
do_task() {
  # Prompt the user for the ID of the task to mark as done
  read -p "Enter the ID of the task to mark as done: " task_id

  # Check if the task ID is valid
  if [[ $task_id -lt 0 || $task_id -ge ${#todo_list[@]} ]]; then
    echo "Invalid task ID"
    return
  fi

  # Mark the task as done by removing it from the to-do list array
  unset todo_list[$task_id]
}

# Function to delete a task
delete_task() {
  # Prompt the user for the ID of the task to delete
  read -p "Enter the ID of the task to delete: " task_id

  # Check if the task ID is valid
  if [[ $task_id -lt 0 || $task_id -ge ${#todo_list[@]} ]]; then
    echo "Invalid task ID"
    return
  fi

  # Delete the task from the to-do list array
  unset todo_list[$task_id]
}

# Function to show finished tasks
show_finished() {
  # Print the header
  printf "%-5s %s\n" "ID" "Task"

  # Print each task in the done_list array
  for ((i=0; i<${#done_list[@]}; i++)); do
    printf "%-5s %s\n" "$i" "${done_list[$i]}"
  done
}

# Function to search for a task
search_task() {
  # Prompt the user for the search query
  read -p "Enter search query: " query

  # Print the header
  printf "%-5s %s\n" "ID" "Task"

  # Search the to-do list array for tasks that contain the search query
  for ((i=0; i<${#todo_list[@]}; i++)); do
    if [[ "${todo_list[$i]}" == *"$query"* ]]; then
      printf "%-5s %s\n" "$i" "${todo_list[$i]}"
    fi
  done
}

# Main menu
