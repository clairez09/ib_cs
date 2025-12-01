package GroupFourProject;

import java.util.*;

public class MartianExpertSystem {

    public static void main(String[] args) {

        // ---- 1. LOAD PLANT DATABASE ----
        List<Plant> database = PlantLoader.loadPlantsFromCSV("plants.csv");

        System.out.println("=== MARTIAN AGRICULTURE EXPERT SYSTEM ===\n");

        Scanner scanner = new Scanner(System.in);

        // ---- 2. GATHER SOIL INPUTS ----
        System.out.print("Enter soil pH: ");
        double soilPH = scanner.nextDouble();
        scanner.nextLine(); // clear buffer

        System.out.print("Enter microbe quantity (low/medium/high): ");
        String soilMicrobes = scanner.nextLine();

        System.out.print("Enter phosphate level (low/medium/high): ");
        String soilPhosphate = scanner.nextLine();

        System.out.print("Enter potassium level (low/medium/high): ");
        String soilPotassium = scanner.nextLine();

        System.out.print("Enter nitrate level (low/medium/high): ");
        String soilNitrate = scanner.nextLine();

        System.out.print("Enter soil aeration (loose/moderate/compact): ");
        String soilAeration = scanner.nextLine();

        System.out.println("\n--- ANALYZING SOIL CONDITIONS ---\n");

        // ---- 3. RUN RULE-BASED MATCHER ----
        Map<Plant, PlantRuleMatcher.MatchResult> matchResults =
                PlantRuleMatcher.matchPlants(
                        soilPH, soilMicrobes, soilPhosphate,
                        soilPotassium, soilNitrate, soilAeration, database
                );

        if (matchResults.isEmpty()) {
            System.out.println("No plants match these soil conditions. Consider adjusting soil chemistry.");
            return;
        }

        // ---- 4. CALCULATE CONFIDENCE SCORES ----
        Map<Plant, Double> confidence = PlantRuleMatcher.calculateConfidence(matchResults);

        // ---- 5. FIND TOP RECOMMENDED PLANT ----
        Plant bestPlant = null;
        double bestScore = -1;

        for (Plant p : confidence.keySet()) {
            if (confidence.get(p) > bestScore) {
                bestScore = confidence.get(p);
                bestPlant = p;
            }
        }

        // ---- 6. OUTPUT NATURAL-LANGUAGE EXPLANATION ----
        PlantRuleMatcher.MatchResult explanation = matchResults.get(bestPlant);
        String naturalExplanation = PlantRuleMatcher.buildNaturalExplanation(bestPlant, explanation);

        System.out.println(" BEST RECOMMENDATION: " + bestPlant.name);
        System.out.printf("Confidence Rating: %.2f%%\n\n", bestScore);

        System.out.println("Why this plant?");
        System.out.println(naturalExplanation + "\n");

        // ---- 7. GET SOIL ENRICHMENT STEPS ----
        System.out.println("--- SUGGESTED SOIL ENRICHMENT STEPS ---");

        List<String> enrichSteps = SoilEnrichmentEngine.getEnrichmentSteps(
                soilPH, soilMicrobes, soilPhosphate, soilPotassium,
                soilNitrate, soilAeration, bestPlant
        );

        if (enrichSteps.isEmpty()) {
            System.out.println("No enrichment steps needed. Conditions already match the plant’s needs!");
        } else {
            for (String step : enrichSteps) {
                System.out.println("- " + step);
            }
        }

        System.out.println("\n=== ANALYSIS COMPLETE ===");

        scanner.close();
    }
}
