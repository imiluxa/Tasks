public class Range {
    private int lower;
    private int higher;

    public Range(int lower, int higher) {
        this.lower = lower;
        this.higher = higher;
    }

    public boolean contains(int number) {
        return (number >= lower && number <= higher);
    }

    public void updateRange(int lower, int higher) {
        this.lower = lower;
        this.higher = higher;
    }

    public int getLower() {
        return this.lower;
    }
    public int getHigher() {
        return this.higher;
    }
}