package JavaBasic;

class Datatypes{
    public static void main(String[] args) {
               // Primitive Datatypes

               int myNum =10; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
               float myFloat = 20f; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
               byte myByte = 121; // Stores whole numbers from -128 to 127
               double myDouble = 25627d; // Stores fractional numbers. Sufficient for storing 15 decimal digits
               char myChar = 'a'; // Stores a single character/letter or ASCII values
               long myLong = 356; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
               short myShort = 1873; // Stores whole numbers from -32,768 to 32,767
           
               System.out.println(myNum);
               System.out.println(myFloat);
               System.out.println(myByte);
               System.out.println(myChar);
               System.out.println(myLong);
               System.out.println(myShort);
               System.out.println(myDouble);
       
               boolean trueVar = true;
               boolean falseVar = false;
               System.out.println(trueVar);
               System.out.println(falseVar);
       
               // Non- Primitive DataTypes
               /*
               Strings
               Arrays
               Interfaces
               */ 
               String string = "Hello World";
               System.out.println(string);
    }
}