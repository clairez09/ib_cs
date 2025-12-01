package GroupFourProject;

public class Plant {
    public String name;
    public double minPH;
    public double maxPH;
    public String microbePreference;   // low / medium / high
    public String phosphateNeed;       // low / medium / high
    public String potassiumNeed;       // low / medium / high
    public String nitrateNeed;         // low / medium / high
    public String aerationNeed;        // loose / moderate / compact-tolerant
    public String nutrientDensity;     // low / medium / high

    // This is the constructor that matches the 9 items sent by PlantLoader
    public Plant(String name, double minPH, double maxPH,
                 String microbePreference, String phosphateNeed,
                 String potassiumNeed, String nitrateNeed,
                 String aerationNeed, String nutrientDensity) {

        this.name = name;
        this.minPH = minPH;
        this.maxPH = maxPH;
        this.microbePreference = microbePreference;
        this.phosphateNeed = phosphateNeed;
        this.potassiumNeed = potassiumNeed;
        this.nitrateNeed = nitrateNeed;
        this.aerationNeed = aerationNeed;
        this.nutrientDensity = nutrientDensity;
    }
}

