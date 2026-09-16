// public class first {
//     public static void main(String[] args) {
//         int[] a = {10, 25, 5, 40, 30};
//         int max = 0, second = 0;

//         for (int n : a) {
//             if (n > max) {
//                 second = max;
//                 max = n;
//             } else if (n > second)
//                 second = n;
//         }

//         System.out.println("Second Largest: " + second);
//     }
// }

public class first {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 20, 40, 10, 50};

        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j])
                    System.out.println(a[i]);
    }
}