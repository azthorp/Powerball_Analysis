package lottery;

import java.io.*;
import java.util.*;

public class PowerballAnalysis {
    public static void main(String[] args) {
        try (InputStream input = PowerballAnalysis.class.getResourceAsStream("/Powerball_Winning_Numbers.csv");
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {

            String line = reader.readLine(); // skip header row

            // One map per pick position
            Map<Integer, Integer>[] positionFreq = new HashMap[5];
            for (int i = 0; i < 5; i++) {
                positionFreq[i] = new HashMap<>();
            }

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                if (row.length < 2) continue;

                String[] numbers = row[1].trim().split(" ");
                if (numbers.length < 5) continue;

                for (int i = 0; i < 5; i++) {
                    int n = Integer.parseInt(numbers[i].trim());
                    positionFreq[i].put(n, positionFreq[i].getOrDefault(n, 0) + 1);
                }
            }

            // Print results
            for (int i = 0; i < 5; i++) {
                int pos = i + 1;
                System.out.println("\nTop 3 numbers for Pick " + pos + ":");

                List<Map.Entry<Integer, Integer>> sorted = positionFreq[i].entrySet().stream()
                        .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                        .toList();

                // Print top 3
                sorted.stream().limit(3).forEach(entry ->
                    System.out.println("Number " + entry.getKey() + " → " + entry.getValue() + " times")
                );

                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}