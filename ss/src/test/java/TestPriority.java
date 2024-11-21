


import org.junit.Test;

import java.time.LocalDateTime;
import java.util.PriorityQueue;


public class TestPriority {
    @Test
    public void test1() {
        PriorityQueue<Employee> priority = new PriorityQueue<>();
        priority.add(new Employee(11, "one", LocalDateTime.now()));
        priority.add(new Employee(12, "two", LocalDateTime.now()));
        priority.add(new Employee(14, "four", LocalDateTime.now()));
        priority.add(new Employee(16, "six", LocalDateTime.now()));
        priority.add(new Employee(15, "five", LocalDateTime.now()));
        priority.add(new Employee(13, "three", LocalDateTime.now()));

        while (true) {
            Employee poll = priority.poll();
            System.out.println(poll);
            if (poll == null) {
                break;
            }
        }
    }

}
