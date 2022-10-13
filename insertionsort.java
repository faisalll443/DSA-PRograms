public class insertionsort {
    public static void main(String[] args) {
        int a[] = { 7, 1, 2, 39, 4, 7, 11 };
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;

        }

        System.out.println("After Insertion Sorting---->");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}