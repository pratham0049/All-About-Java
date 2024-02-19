package JavaBasic;
/*
    Type casting is when you assign a value of one primitive data type to another type.
    In Java, there are two types of casting:
    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double
    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte 
 */
public class TypeCasting {
    public static void main(String[] args){
    // Automatic Casting
        int num = 293;
        double myDouble = num;
        System.out.println(num); // outputs 293
        System.out.println(myDouble); // outputs 293.0

    // Manual Casting
    double Double = 24.46d;
    int myInt = (int) Double; // Manual casting: double to int

    System.out.println(Double);   // Outputs 24.46
    System.out.println(myInt);      // Outputs 24

    }
}
