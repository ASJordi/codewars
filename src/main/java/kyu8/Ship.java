package kyu8;

public class Ship {

    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        double weightOfTheCrew = this.crew * 1.5;
        return draft - weightOfTheCrew > 20;
    }
}
