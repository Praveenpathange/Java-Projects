class Variable_Datatypes{
    public static void main(String[] args){
        int x ;    // Variable Declaration 
        x = 100;   // Variable Intiallisation 
        System.out.println(x);

        // ------ Primitive Data type ------
        byte a = 100;    // 1 byte
        short b = 190;   // 2 bytes
        int c = 112;     // 4 bytes
        long d = 100000; // 8 bytes

        float f = 3.21f;           // 4 bytes
        double v = 3.14159265359;  // 8 bytes

        char ch = 'A';         // 2 bytes (Unicode Charecter) 
        boolean flag = true;   // 1 byte

        // ------ Non - Primitive Data type ------
        String sh = "Happy";
        int arr[] = {1,2,3,4};

         // -------- Output --------
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + f);
        System.out.println("double: " + v);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + sh);
        System.out.print("Array: "+arr[1]);
    }
}