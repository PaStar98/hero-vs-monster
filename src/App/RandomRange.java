package App;

public class RandomRange {
    public static int calculate(int minRange, int maxRange) {
        int range = maxRange - minRange + 1;
        return (int) (Math.random() * range) + minRange;
    }
}
