public class sumofnum {
    public static void main(String[] args){
        int num=432;
        int sum=0;
        int r=0;
        while(num!=0){
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println(sum);
    }

}
