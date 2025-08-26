package math;

class Math {

    public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!






    //ANSWER:



    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): A integer is something that is defined with a number: int number = 1
    //double: A double is something defined via a decimal: double decimal = 0.0
    //boolean: A boolean is something defined by either true or false: boolean valid = true
    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES

    int four =  4;
    double hello = 0.0;
    boolean human = true;




    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    int a = 10;
    int b = 5;
    System.out.println("10 - 5 is equal to " + (a - b));

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
    System.out.println("\n\nOdd integers:");
    for(int i = 1; i < 100; i = i + 2){
      System.out.print(i + ", ");
    }

    //All multiples of 3 from 1 to 100
    System.out.println("\n\nMultiples of 3:");
    for (int i = 1; i < 100; i = i + 3){
      System.out.print(i + ", ");
    }


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
    System.out.println("\n\n1000 to 0:");
    for (int i = 1000; i <= 1000 && i >= 0; i = i - 10) {
      System.out.print(i + " - ");
    }
  }
}
