package aquarium;

public class Clownfish extends Fish {
    private static final boolean SORT_TERM_MEMORY_LOSS = false;

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void feed() {
        weight++;
    }

    @Override
    public boolean hasMemoryLoss() {
        return SORT_TERM_MEMORY_LOSS;
    }
}
