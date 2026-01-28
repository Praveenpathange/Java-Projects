import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int num=n;
        int rev=0;
        while(num>0){
            rev = rev*10+(num%10); // Stores the full reversed number
            num = num / 10;
        }
        if(rev==n){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        sc.close();
    }
}