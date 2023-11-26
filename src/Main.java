
import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
     {

//        Date time = new Date();
//        System.out.println(time);



//                                      This is a example of refrence types
//        Point point1 = new Point(1,2);
//        Point point2=point1 ;
//        System.out.println(point1);




//                                      Example of True False cheking of the String
//    String Text ="Hello Arad";
//    boolean checking= Text.endsWith("d");
//    System.out.println(checking);



//
//        String Test = new String("sham bia pish man");
//
//        System.out.println(Test.replace("s","z") );


//                                    Tips: Tab: /t, next line: /n




//      int[] Aran= new int [5];
//      Aran[2]=6;

//                                   or (Different Wayys of defining Arrays)
//
//      int[] Aran= {11,535,23,45,45};
//      System.out.println(Aran.length);
//      Arrays.sort(Aran);
//      System.out.println(Arrays.toString(Aran));



//                                     Math Operators
//        float Num1= (float)43/(float)12;  // If we want to obtain the Decimal remainder we got to turn numbers to Float
//        System.out.println(Num1);

//        int x = 5;
//        x=x+3 ; //8
//        System.out.println(x);
//
//
//
//        x+=3; // Another way of incremeant  (Aumented assignment operators)
//        System.out.println(x);

                     // Explicit Casting
//        double x=54.22 ;
//        int sum= (int)x+20;
//        System.out.println(sum);


                    //wrapper classes

//        String x = "27" ;
//        long sum = Long.parseLong(x)+3 ;
//        System.out.println(sum);

                     // Math Class Example
//        System.out.println(Math.round(1.6F));

                     // Input from the user
//        Scanner aRan = new Scanner(System.in);
//        byte x = aRan.nextByte();
//        System.out.println("My Age is:"+x);

                    // Stupid way to get full Vorname and Familiname all together printed ( All Tokens in a line )
//        Scanner inpurScanner = new Scanner(System.in);
//        System.out.print("Your Name:");
//        String name = inpurScanner.next();
//        String name1 = inpurScanner.next();
//        System.out.println("my name is "+name + name1);


                   // Good way to get full Vorname and Familiname all together printed

//        Scanner inpurScanner = new Scanner(System.in);
//        System.out.print("Your Name:");
//        String name = inpurScanner.nextLine().trim(); // Method Chaining // utlizing more than one method for a class
//        System.out.println("my name is "+name);



                   //Comparison Expression
//        int x = 5;
//        int y=6 ;
//
//        System.out.println(x==y); // Boolean expression

                 //Comparison Expression
//        boolean shalvarak= false;
//        boolean pirahan = true;
//        int age = 53 ;
//
//        boolean canRegister = (shalvarak==false) && (pirahan==true) && (age<55) ; //if one of them was false the result would be false either.
                               //OR
        //      boolean canRegister = !shalvarak && pirahan==true && age<55 ;
//
//        System.out.println(canRegister);



        // If Condition
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("plz your age");
//        int age = scanner.nextInt();
//        if (age<25) {
//            System.out.println("you cant");
//        }
//        else if (age<55) {
//            System.out.println("it deponds");
//        }
//        else {
//            System.out.println("you can");
//        }



        //Switch Condition
//        String position = "user";
//
//        switch (position){
//            case "Admin" :
//                System.out.println("Horaaaaaa");
//                break;   //If we dont use break, next line will be implemented
//            case "user":
//                System.out.println("kooooft");
//                break;
//            default:   // Difeult is like "Else"
//                System.out.println("you are my love");
//        }

                //Assignment
//        Scanner scanner = new Scanner(System.in); //get "input" from user
//        System.out.println("Plz enter a number");
//        int num = scanner.nextInt(); // we have a integer called num that we wana get from user
//        if (num%5==0 && num%3==0)  // we could also user inner IF inside the first IF in order to optimize code // nested if statement
//            System.out.println("bizz buzz");
//        else if (num%5==0)
//            System.out.println("bizz");
//        else if (num%3==0)
//            System.out.println("buzz");
//
//        else
//            System.out.println(num);


        //For Loop
//          for (int i=0; i<5; i++){
//            System.out.println("Aran"+i );
//
//        }


            //While Loop
//        String input = "";
//        Scanner scanner =new Scanner(System.in);
//
//        while (!input.equals("aran")){
//            System.out.println("input write: ");
//            input= scanner.next().toLowerCase();
//            System.out.println(input);
//        }

            //Continue Example
//        for (int i=1; i<23; i++) {
//            if (i % 5 == 0)
//                continue; //to Begin of Loop
//            else
//                System.out.println(i);
//        }



            //Postiive Negetive Assignment
// Scanner scanner = new Scanner(System.in);
//
//        int number ;
//      while (true) {
//          System.out.println("Write the number");
//          number= scanner.nextInt();      //IF user gets the input out of loop it doesn't make sense because that would cause infinite loop with one time input it
//
//          if (number > 0)
//              System.out.println("Posetive");
//          else if (number < 0)
//              System.out.println("Negetive");
//          else
//              System.out.println("Zero");
//      }


            //Array Sorting

//      int[] abolfazl={26,45,3,454,8,6,1,5,45,26} ;
//        Arrays.sort(abolfazl);
//        System.out.println("show me sorted:");
//        for (int i : abolfazl) {
//            System.out.println(i);
//        }



//        int[] abolfazl = {26, 45, 3, 454, 8, 6, 1, 5, 45, 26};
//
//        for (int i = 0; i < abolfazl.length; i++) {
//            for (int j = i + 1; j < abolfazl.length; j++) {
//                if (abolfazl[i] == abolfazl[j]) {
//                    System.out.println("Element " + abolfazl[i] + " is repeated at indexes " + i + " and " + j);
//                }
//            }
//        }



//        String aran = "Hello This Is Me";
//        String khali= "";
//         char[] lowercase= aran.toCharArray();
//         for(char counter : lowercase){
//             if (Character.isLowerCase(counter))
//                 khali += Character.toUpperCase(counter);
//             else
//                 khali += Character.toLowerCase(counter);
//         }
//        System.out.println( khali);
//            //khali.charAt() // to get the character at a specified index within the string.




//        String sentence = "how is it going darling";
//        String[] words = sentence.split(" ");
//
//        String smallest = words[0];
//        String largest = words[0];
//
//        for (String word : words) {
//            if (word.length() < smallest.length()) {
//                smallest = word;
//            }
//            if (word.length() > largest.length()) {
//                largest = word;
//            }
//        }
//
//        System.out.println("Smallest word: " + smallest);
//        System.out.println("Largest word: " + largest);


         // My name is aran
}