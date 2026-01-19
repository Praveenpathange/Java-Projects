class Loops{
    public static void main(String[] args){

        System.out.println("--- While Loop ---");
        int j = 1;
        while (j <= 5){
            System.out.println(j);
            j++;
        }

        System.out.println("--- For Loop ---");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("--- Do-While Loop ---");
        int k = 30;
        do { 
            System.out.println(k);
            k--;
        } while (k>20);

        System.out.println("---- Enhanced For Loop ----");
        int numbers[] = {20,30,40,50};
        for(int num : numbers){
            System.out.println(num);
        }
    }
}