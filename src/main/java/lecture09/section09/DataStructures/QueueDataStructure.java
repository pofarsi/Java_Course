package lecture09.section09.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

// Queue means FIFO - FIRST IN FIRST OUT
public class QueueDataStructure {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        // difference between .add and .offer is, .offer remove false when queue is full but .add throw an exception.
        queue.offer(new Person(" Alex"));
        queue.offer(new Person(" Sasha"));
        queue.offer(new Person(" Nicole"));
        queue.offer(new Person(" Megan"));
        // we log everyone in queue
        System.out.println(queue);
        System.out.print(queue.peek());
        System.out.println("  ---> .peek");
        /* poll method remove the first one but difference between poll and remove is when queue is null
         with .poll we get null but with remove we get an exception. */
        System.out.print(queue.poll());
        System.out.println("  ---> .poll");
        System.out.print(queue.peek());
        System.out.println("  ---> .peek");
        System.out.println(queue);

        queue.forEach(person -> System.out.println(person.name));


    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
