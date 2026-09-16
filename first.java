public class first {
    public static void main(String[] args) {
        int[] a = {10, 25, 5, 40, 30};
        int max = 0, second = 0;

        for (int n : a) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second)
                second = n;
        }

        System.out.println("Second Largest: " + second);
    }
}