package semester1.practice06;

public class GradeBook {
    private String studentName;
    private int[] grades;

    public void setData(String name, int[] g) {
        studentName = name;
        grades = g;
    }

    public double getAverage() {
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return sum / (grades.length * 1.00);
    }

    public int getHighestGrade() {
        int result = grades[0];
        for (int i : grades) {
            if (result < i) {
                result = i;
            }
        }
        return result;
    }

    public int getLowestGrade() {
        int result = grades[0];
        for (int i : grades) {
            if (result > i) {
                result = i;
            }
        }
        return result;
    }
}
