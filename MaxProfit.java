import java.util.Scanner;
public class MaxProfit {
    public static int maxProfit(int a[],int n){
        int buy_price=a[0];
        int profit=0;
        for(int j=1;j<n;j++){
            if(a[j]<buy_price){
                buy_price=a[j];
            }
            else if(a[j]-buy_price>profit){
                profit=a[j]-buy_price;
            }
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(maxProfit(a,n));
    }
}
