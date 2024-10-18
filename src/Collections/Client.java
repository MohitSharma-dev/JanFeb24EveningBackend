package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Mohit", 26, 2020, 92.0 , 90.0);
        Student st2 = new Student("Raman", 21, 2016, 9.0 , 90.0);
        Student st3 = new Student("Naman", 28, 2025, 19.0 , 91.0);
        Student st4 = new Student("Anshuman", 24, 2021, 90.0 , 92.0);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        Collections.sort(students, new StudentPSPComparator());

        for(Student s : students){
            System.out.println(s.getName() + " " + s.getGradYear() + " " + s.getPsp() + " " + s.getAttendance());
        }

//        Collection
        List<Student> students2 = new Vector<Student>();

        Queue<Integer> pq = new PriorityQueue<>();
//        peek , offer , poll
        pq.offer(26);
        pq.offer(21);
        pq.offer(28);
        pq.offer(24);
        pq.offer(19);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

        Queue<Student> pq1 = new PriorityQueue<Student>(new StudentPSPComparator());
        pq1.offer(st1);
        pq1.offer(st2);
        pq1.offer(st3);
        pq1.offer(st4);

        while(!pq1.isEmpty()){
            Student s = pq1.poll();
            System.out.println(s.getName() + " " + s.getGradYear() + " " + s.getPsp() + " " + s.getAttendance());
        }

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new TreeSet<>();

        Set<Student> set3 = new TreeSet<>(new StudentPSPComparator());

        set.add(26);
        set.add(210);
        set.add(28);
        set.add(24);
        set.add(19);

        set2.add(26);
        set2.add(21);
        set2.add(28);
        set2.add(24);
        set2.add(19);

        set1.add(26);
        set1.add(21);
        set1.add(28);
        set1.add(24);
        set1.add(19);
        set1.add(28);

        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);


    }
}
