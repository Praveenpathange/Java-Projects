import java.util.*;
class Binary_Search{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array : ");
    int n = sc.nextInt();
    System.out.println("Enter the elements : ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int start = 0,end=n-1;
    
    System.out.print("Enter the target element : ");
    int target = sc.nextInt();
    boolean found = false;
    while(start<=end){
      int mid = (start+end)/2;
      if(target==arr[mid]){
        found=true;
        break;
      }else if(target<arr[mid]){
        end = mid-1;
      }else if(target>arr[mid]){
        start = mid+1;
      }else{
        System.out.println("Target not found");
      }
    }
    if(found==true){
      System.out.println("Target found");
    }
  }
}