package aquarium;

public class Fish {
    private String name;
    private int weight;
    private String color;
    private boolean sortTermMemoryLoss;

    public Fish(String name, int weight, String color, boolean sortTermMemoryLoss) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.sortTermMemoryLoss = sortTermMemoryLoss;
    }

    public String getStatus() {
        return name + ", weight: " + weight + ", color: " + color +
                ", short-term memory loss: " + sortTermMemoryLoss;
    }

    public void feed() {
        weight++;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return sortTermMemoryLoss;
    }
}
