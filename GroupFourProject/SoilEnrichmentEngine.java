package GroupFourProject;

public class SoilEnrichmentEngine {

    public static List<String> getEnrichmentSteps(
            double soilPH, String microbes, String phosphate,
            String potassium, String nitrate, String aeration, Plant p) {

        List<String> steps = new ArrayList<>();

        // pH
        if (soilPH < p.minPH) steps.add("Increase pH by adding alkaline mineral amendments.");
        if (soilPH > p.maxPH) steps.add("Lower pH using sulfur or acidic organic matter.");

        // microbes
        if (!microbes.equalsIgnoreCase(p.microbePreference)) {
            steps.add("Adjust microbe levels using microbial inoculants or compost extracts.");
        }

        // phosphate
        if (!phosphate.equalsIgnoreCase(p.phosphateNeed)) {
            steps.add("Modify phosphate levels using rock phosphate or phosphorus-rich compost.");
        }

        // potassium
        if (!potassium.equalsIgnoreCase(p.potassiumNeed)) {
            steps.add("Adjust potassium using potash, kelp extract, or mineral supplements.");
        }

        // nitrates
        if (!nitrate.equalsIgnoreCase(p.nitrateNeed)) {
            steps.add("Balance nitrate levels with nitrogen-fixing microbes or nitrate amendments.");
        }

        // aeration
        if (!aeration.equalsIgnoreCase(p.aerationNeed)) {
            steps.add("Modify soil structure using biochar, sand, or mechanical aeration.");
        }

        return steps;
    }
}

