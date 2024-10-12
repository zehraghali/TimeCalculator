package org.example;

public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Nopeuden on oltava suurempi kuin nolla.");
        }
        return distance / speed;
    }
}
