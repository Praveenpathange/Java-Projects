import java.util.Scanner;
public class Armstrong_No{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int num=n;

        while(num>0){
            num/=10;
            count++;
        }

        num=n;
        int same=0;
        
        while(num>0){
            int digit = num%10;
            same += (int) Math.pow(digit, count);
            num/=10;
        }
        if(same==n){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
}