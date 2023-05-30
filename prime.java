import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=15;
        boolean m=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                m=false;
                break;
            }
        }
        if(m){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
