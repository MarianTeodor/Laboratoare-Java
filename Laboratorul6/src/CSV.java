package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSV{
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Marian\\IdeaProjects\\Laboratorul6\\Top16.csv";
        List<CSVdata> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                CSVdata csvData = new CSVdata(
                        values[0].trim(),
                        values[1].trim(),
                        values[2].trim()
                );

                dataList.add(csvData);


                System.out.println(csvData);
            }


            /*Collections.sort(dataList);

            for (CSVdata data : dataList) {
                System.out.println(data);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}