package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fish = new ArrayList<>();
    public static final int CAPACITY = 20;

    public void addFish(Fish newFish) {
        if (fish.size() < CAPACITY / 5) {
            fish.add(newFish);
        }
        else {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public void feed() {
        for (Fish actual : fish) {
            actual.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> overWeightFish = new ArrayList<>();
        for (Fish actual : fish) {
            if (actual.getWeight() > maxWeight) {
                overWeightFish.add(actual);
            }
        }
        fish.removeAll(overWeightFish);
    }

    public List<String> getStatus() {
        List<String> fishStatus = new ArrayList<>();
        for (Fish actual : fish) {
            fishStatus.add(actual.getStatus());
        }
        return fishStatus;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int counter = 0;
        for (Fish actual : fish) {
            if (actual.hasMemoryLoss()) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish actual : fish) {
            if (actual.getColor().contains(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        int smallestWeight = Integer.MAX_VALUE;
        Fish result = fish.get(0);
        for (Fish actual : fish) {
            if (actual.getWeight() < smallestWeight) {
                smallestWeight = actual.getWeight();
                result = actual;
            }
        }
        return result;
    }
}
