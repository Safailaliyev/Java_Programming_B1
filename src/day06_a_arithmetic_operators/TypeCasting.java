package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {


        byte b = 40;
        int i = b;  // the byte value is automatically(implicitly) converted to int, because byte us smaller that int.

        int  i2 = 100;
//        byte b2 = i2;  //reassigning check the data type first. that is why we can not put it this way
        byte b2 = (byte)i2;  //reassigning check the data type first. with casting we can put like this.
        byte b3 = 100;  //putting a value directly gives a data type automatically after checking the range

        System.out.println("b2: " +b2);
        System.out.println("b3" + b3);


        int i3 = 130;
        byte b4 = (byte)i3; //-128_______127 ----> after casting the data type, it check the value if it is in the
        System.out.println("b4: " + b4);


        char letter1 = 65;// Implicity casting(automatically casts)
        //char letter1 = (char)65; //expilit casting (automatically casts)
        char letter2 ='A';
        System.out.println("letter1" + letter2);
        System.out.println("letter2" + letter2);

        byte b5 = 'B';
        char letter3 = (char)b5;
        System.out.println("letter3:"+ letter3);



        byte aa = 5;
        char bb = (char)aa;

        System.out.println("bb: " + bb);


        int i10 =500;
        long l1 = i10; // int is smaller that long, so it will automatically cast

        long l2 = 200;
        int i11 = (int)l2; //here the explicit casting in needed

        long l3 = 1_000_000_000_000l;
        int i12 = (int)l3; //here the explicit casting in needed

        System.out.println();
        double d = 50.5;
        System.out.println("d: " +d);


        int i13 = (int)d;
        System.out.println("i13 " + i13);




    }
}
