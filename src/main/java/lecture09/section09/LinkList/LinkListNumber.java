package lecture09.section09.LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

public class LinkListNumber {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "0");
        addInOrder(placesToVisit, "1");
        addInOrder(placesToVisit, "3");
        addInOrder(placesToVisit, "4");
        addInOrder(placesToVisit, "5");
        printList(placesToVisit);

        addInOrder(placesToVisit, "4");
        addInOrder(placesToVisit, "2");
        addInOrder(placesToVisit, "6");
        printList(placesToVisit);
        check(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        // Iterator is a way of accessing and go through all entries in array, arraylist, etc. It's looks like for loop
        // And the first place is set up by Iterator for going to first number we should use stringListIterator.next()
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next()); // i.next() is equivalent to i++
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newNumber) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newNumber);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newNumber + " is already exist");
                return false;
            } else if (comparison > 0) {
                // new Number should appear before this one
                // 1  -> 0
                stringListIterator.previous();
                // because we use .nex() we already move to next record now we have to use previous()
                // to go back then add number.
                stringListIterator.add(newNumber);
                return true;
            } else if (comparison < 0) {
                // move on next number
            }
        }

        stringListIterator.add(newNumber);
        return true;
    }

    private static void check(LinkedList numbers) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        // preventing from infinite loop of double printing _ changing direction.
        ListIterator<String> listIterator = numbers.listIterator();

        if (numbers.isEmpty()) {
            System.out.println("No Number ");
            return;
        } else {
            System.out.println("Now Checking " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Exiting .... ");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Checking " + listIterator.next());
                    } else {
                        System.out.println("End of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Checking " + listIterator.previous());
                    } else {
                        System.out.println("Start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu() {
        System.out.println("\t**** Option **** ");
        System.out.println("0 - to quit\n" +
                "1 - go to next number\n" +
                "2 - go to previous number\n" +
                "3 - print menu options");
    }
}