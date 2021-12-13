package aquarium;

public class Kong extends Fish {
    private static final boolean SORT_TERM_MEMORY_LOSS = false;

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void feed() {
        weight += 2;
    }

    @Override
    public boolean hasMemoryLoss() {
        return SORT_TERM_MEMORY_LOSS;
    }
}
