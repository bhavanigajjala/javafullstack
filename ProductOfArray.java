import java.util.Scanner;
public class ProductOfArray {
    public static void productArray(int a[], int n) {
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        b[0] = 1;
        c[n-1]=1;
        for (int j = 1; j < n; j++)
            b[j] = b[j - 1] * a[j - 1];
        for (int k = n - 2; k >= 0; k--)
            c[k] = c[k + 1] * a[k + 1];
        for (int l = 0; l < n; l++)
            d[l] = b[l] * c[l];
        for (int m = 0; m < n; m++)
            System.out.print(d[m] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        productArray(a, n);
    }
}

