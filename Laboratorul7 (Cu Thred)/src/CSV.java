package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Marian\\Desktop\\Top16.csv";
        List<CSVdata> dataList = new ArrayList<>();

        // Reading from file in a separate thread
        Thread readThread = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                br.readLine(); // Skipping header

                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    CSVdata csvData = new CSVdata(
                            values[0].trim(),
                            values[1].trim(),
                            values[2].trim()
                    );

                    synchronized (dataList) {
                        dataList.add(csvData);
                    }

                    System.out.println(csvData);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Writing to file in a separate thread
        Thread writeThread = new Thread(() -> {
            // Implement the logic for writing to the file here
            // You can use synchronized methods/blocks to ensure thread safety
            synchronized (dataList) {
                // Write to file logic here
                // Example: writeDataToFile(dataList);
            }
        });

        // Start the timer
        long startTime = System.currentTimeMillis();

        // Start the threads
        readThread.start();
        writeThread.start();

        try {
            // Wait for both threads to finish
            readThread.join();
            writeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the timer
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

        /* Collections.sort(dataList);

        for (CSVdata data : dataList) {
            System.out.println(data);
        } */
    }
}
