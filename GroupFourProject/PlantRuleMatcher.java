package GroupFourProject;

public class PlantRuleMatcher {

    public static class MatchResult {
        public int score = 0;
        public List<String> explanations = new ArrayList<>();
    }

    public static Map<Plant, MatchResult> matchPlants(
            double soilPH, String soilMicrobes, String soilPhosphate,
            String soilPotassium, String soilNitrate, String soilAeration,
            List<Plant> database) {

        Map<Plant, MatchResult> results = new HashMap<>();

        for (Plant plant : database) {

            MatchResult r = new MatchResult();

            // RULE 1 — pH
            if (soilPH >= plant.minPH && soilPH <= plant.maxPH) {
                r.score += 30;
                r.explanations.add("the soil pH falls within the plant's preferred range");
            }

            // RULE 2 — microbes
            if (soilMicrobes.equalsIgnoreCase(plant.microbePreference)) {
                r.score += 20;
                r.explanations.add("the quantity of beneficial microbes matches what the plant prefers");
            }

            // RULE 3 — phosphates
            if (soilPhosphate.equalsIgnoreCase(plant.phosphateNeed)) {
                r.score += 15;
                r.explanations.add("phosphate availability aligns with the plant's nutrient requirements");
            }

            // RULE 4 — potassium
            if (soilPotassium.equalsIgnoreCase(plant.potassiumNeed)) {
                r.score += 15;
                r.explanations.add("potassium levels match this plant's needs");
            }

            // RULE 5 — nitrates
            if (soilNitrate.equalsIgnoreCase(plant.nitrateNeed)) {
                r.score += 15;
                r.explanations.add("nitrate levels suit the plant's nitrogen needs");
            }

            // RULE 6 — aeration / compaction
            if (soilAeration.equalsIgnoreCase(plant.aerationNeed)) {
                r.score += 20;
                r.explanations.add("soil aeration and compaction match the plant's tolerance");
            }

            // RULE 7 — nutrient density bonus
            switch (plant.nutrientDensity.toLowerCase()) {
                case "high": r.score += 20; break;
                case "medium": r.score += 10; break;
            }

            if (r.score > 0) results.put(plant, r);
        }

        return results;
    }

    public static Map<Plant, Double> calculateConfidence(Map<Plant, MatchResult> scores) {
        Map<Plant, Double> c = new HashMap<>();
        int total = scores.values().stream().mapToInt(r -> r.score).sum();

        for (Plant p : scores.keySet()) {
            c.put(p, (scores.get(p).score * 100.0) / total);
        }

        return c;
    }

    public static String buildNaturalExplanation(Plant plant, MatchResult r) {
        StringBuilder sb = new StringBuilder();

        sb.append(plant.name).append(" is recommended because ");

        for (int i = 0; i < r.explanations.size(); i++) {
            sb.append(r.explanations.get(i));
            if (i < r.explanations.size() - 2) sb.append(", ");
            else if (i == r.explanations.size() - 2) sb.append(", and ");
        }

        sb.append(". Overall, ").append(plant.name)
          .append(" is well-matched to the Martian soil chemistry and microbial conditions.");

        return sb.toString();
    }
}
}
