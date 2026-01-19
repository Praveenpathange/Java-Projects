import java.util.Scanner;
class Conditions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ----- Score Cheacker ------
    /*  System.out.println("Enter the number : ");
        int marks = sc.nextInt();
        if(marks>=75 && marks<=100){
            System.out.println("Excellent Score");
        }else if(marks>=50 && marks<75){
            System.out.println("Good Score");
        }else if(marks>=0 && marks<50){
            System.out.println("Need Improvement");
        }else{
            System.out.println("Enter the valid score");
        }
    */ 
        System.out.println("Enter the Signal(R/Y/G) : ");
        char ch = sc.next().charAt(0);
        char signal = Character.toUpperCase(ch);
        switch(signal){
            case 'R':
                System.out.println("Stop");
                break;
            case 'Y':
                System.out.println("Get Ready !");
                break;
            case 'G':
                System.out.println("Move on!!");
                break;
            default:
                System.out.println("Enter the valid signal character");
        }
        sc.close();
    }
}