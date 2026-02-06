import java.util.Scanner;
public class Array_Search{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array : ");
       int size = sc.nextInt();
       String[] name = new String[size];
       System.out.println("Enter the "+size+" Words : ");
       name = sc.nextLine();
       for(int i=0;i<size;i++){
         name[i] = sc.nextLine();
         name[i] = name[i].toLowerCase();
       }

       System.out.print("Enter the target : ");
       String target = sc.nextLine();
       target = target.toLowerCase();
       int found=0;

       for(int i=0;i<name.length;i++){
        if(target.equals(name[i])){
            found=1;  
        }
       }
       if(found==1){
        System.out.println(target+" is found");
       }else{
        System.out.println("Not found");
       }
        sc.close();
    }

}
