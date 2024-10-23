package LambdasAndStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 7, 3, 4, 6, 6, 10, 1, 9, 8, 9, 12);
        System.out.println(list);

        Stream<Integer> stream = list.stream();

//        filter : Intermediate
//        forEach : Terminal : Streams get closed

//        Method references
        stream
                .filter((x) -> {
                    System.out.println("Filtered value: check for 2 " + x);
                    return x % 2 == 0;
                })
                .filter((x) -> {
                    System.out.println("Filtered value: check for 3 " + x);
                    return x % 3 == 0;
                })
                .forEach((x) -> {
                    System.out.println(x);
                });
//        stream is closed because of the terminal method
//        stream.forEach((x) -> {System.out.println(x);});

        List<Integer> list1 =
                list
                        .stream()
                        .filter((x) -> {
                            System.out.println("Filtering : " + x);
                            return x % 2 == 0;
                        })
                        .map((x) -> {
                            System.out.println("Mapping " + x);
                            return x * x;
                        })
                        .sorted()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(list1);


        Optional<Integer> x1 =
                list
                        .stream()
                        .filter((x) -> {
                            System.out.println("Filtering : " + x);
                            return x % 2 == 0;
                        })
                        .map((x) -> {
                            System.out.println("Mapping " + x);
                            return x * x;
                        })
                        .sorted()
                        .distinct()
                        .findAny();

        if(x1.isPresent()) {
            System.out.println(x1.get());
        }

        List<Student> students = Arrays.asList(
                new Student("John", Arrays.asList("Math", "Physics")),
                new Student("Mary", Arrays.asList("Physics", "Chemistry")),
                new Student("Pete", Arrays.asList("Physics", "Math"))
        );

//        List of all unique subject learnt by the stundents

        List<List<String>> allCourses = students
                .stream()
                .map((student) -> {
                    return student.getCourses();
                })
                .collect(Collectors.toList());

        for(List<String> course : allCourses) {
            System.out.println(course);
        }

        List<String> allCoursesflattend = students
                .stream()
                .flatMap((student) -> {
                    return student.getCourses().stream();
                })
                .distinct()
                .collect(Collectors.toList());

        System.out.println(allCoursesflattend);


        Set<String> allCoursesflattendSet = students
                .stream()
                .flatMap((student) -> {
                    return student.getCourses().stream();
                })
                .collect(Collectors.toSet());

        System.out.println(allCoursesflattendSet);

//         reduce : reduced a lot of values into a single value
//
//        calculating sum using reduce function

        int sum = 0;
        for(int i = 0 ; i < list.size();i ++){
            sum += list.get(i);
        }
        System.out.println(sum);

        Integer temp =  list
                .stream()
                .reduce(0, (curr_sum , element) -> {
                    return curr_sum + element;
                });

        System.out.println(temp);


    }
}

// normal , parallelStream