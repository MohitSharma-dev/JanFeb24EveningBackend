package LambdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparisonClient {
    private static void comparePerformance() {
        System.out.println("\n2. Performance Comparison:");

        // Generate large dataset
        List<Integer> largeList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeList.add(i);
        }

        // Sequential Stream
        long startTime = System.currentTimeMillis();
        long sequentialSum = largeList.stream()
                .mapToLong(i -> performExpensiveOperation(i))
                .sum();
        long sequentialTime = System.currentTimeMillis() - startTime;

        // Parallel Stream
        startTime = System.currentTimeMillis();
        long parallelSum = largeList.parallelStream()
                .mapToLong(i -> performExpensiveOperation(i))
                .sum();
        long parallelTime = System.currentTimeMillis() - startTime;

        System.out.println("Sequential Time: " + sequentialTime + "ms");
        System.out.println("Parallel Time: " + parallelTime + "ms");
    }

    private static long performExpensiveOperation(int num) {
        // Simulate expensive operation
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return num * 2;
    }


    private static void demonstrateLimitedParallelismBenefit() {
        System.out.println("\nLimited Parallelism Benefit:");

        // Small dataset - parallel is slower
        List<Integer> smallList = Arrays.asList(1, 2, 3, 4, 5);

        long startTime = System.currentTimeMillis();
        smallList.stream().forEach(num -> performLightOperation(num));
        long sequentialTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        smallList.parallelStream().forEach(num -> performLightOperation(num));
        long parallelTime = System.currentTimeMillis() - startTime;

        System.out.println("Sequential Time (small dataset): " + sequentialTime + "ms");
        System.out.println("Parallel Time (small dataset): " + parallelTime + "ms");
    }

    private static void performLightOperation(int num) {
        // Simulate light operation
        Math.sqrt(num);
    }

    public static void main(String[] args) {
        comparePerformance();
        demonstrateLimitedParallelismBenefit();
    }
}
