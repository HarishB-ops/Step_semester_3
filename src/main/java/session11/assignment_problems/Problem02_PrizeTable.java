public class Problem02_PrizeTable {

    static void lineUp(int[] a) {
        int n = a.length;
        int pass = 1;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    swapped = true;
                }
            }

            System.out.print("Pass " + pass + ": [");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k]);
                if (k < n - 1)
                    System.out.print(", ");
            }
            System.out.println("]");

            pass++;

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] heights = {4, 2, 5, 1};

        lineUp(heights);

        int[] heights2 = {1, 3, 2, 4};

        lineUp(heights2);
    }
}
