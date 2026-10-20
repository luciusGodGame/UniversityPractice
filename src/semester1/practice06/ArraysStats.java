package semester1.practice06;

public class ArraysStats {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        numbers = nums;
    }

    public int countEvens() {
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) count++;
        }
        return count;
    }

    public int countOdds() {
        int count = 0;
        for (int n : numbers) {
            if (n % 2 != 0) count++;
        }
        return count;
    }

    public int calculateSum() {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}

