package GroupFourProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PlantLoader {

    public static List<Plant> loadPlantsFromCSV(String filename) {
        List<Plant> plants = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean first = true;

            while ((line = br.readLine()) != null) {
                // Skip header row
                if (first) { first = false; continue; }
                
                // Skip empty lines to prevent crashes
                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(",");
                
                // Safety check to ensure line has enough columns
                if (parts.length < 9) continue;

                Plant p = new Plant(
                    parts[0].trim(),
                    Double.parseDouble(parts[1].trim()),
                    Double.parseDouble(parts[2].trim()),
                    parts[3].trim(),  // microbes
                    parts[4].trim(),  // phosphates
                    parts[5].trim(),  // potassium
                    parts[6].trim(),  // nitrates
                    parts[7].trim(),  // aeration
                    parts[8].trim()   // nutrient density
                );

                plants.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }

        return plants;
    }
}
