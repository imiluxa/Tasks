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
}