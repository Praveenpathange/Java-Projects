import java.util.*;
class Linear_Search{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array : ");
    int n = sc.nextInt();
    System.out.println("Enter the elements : ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the Target : ");
    int target = sc.nextInt();
    int index = -1;
    for(int i=0;i<n;i++){
      if(target==arr[i]){
        index = i;
        
      }
    }
    if(index==-1){
      System.out.println("Target is not found in the array");
    }else{
      System.out.println("Target is found at the index "+index);
    }
  }
}