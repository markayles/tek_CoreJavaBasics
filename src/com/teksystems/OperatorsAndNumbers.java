package com.teksystems;

public class OperatorsAndNumbers
{
    public void run()
    {
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
        problem8();
    }

    // 1.    Write the following integers in binary notation. Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
    //        1      -> 0001
    //        8      -> 1000
    //        33     -> 0010 0001
    //        78     -> 0100 1110
    //        787    -> 0011 0001 0011
    //        33,987 -> 1000 0100 1100 0011


    // 2.    Convert the following binary numbers to decimal notation. Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
    //        0010      -> 2
    //        1001      -> 9
    //        0011 0100 -> 52
    //        0111 0010 -> 114
    //        0010 0001 1111 -> 543
    //        0010 1100 0110 0111 -> 11,367



    // 3.    Write a program that declares an integer a variable x and assigns the value 2 to it and prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
    //
    //    Do the preceding exercise with the following values:
    //
    //        9
    //        17
    //        88
    public void problem3()
    {
        System.out.println();
        System.out.println("Operators & Numbers - Problem 3");

        problem3Helper(9);
        problem3Helper(17);
        problem3Helper(88);
    }

    private void problem3Helper(int num)
    {
        int x = num;
        System.out.println("Decimal: " + x + " - Binary: " + Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("Decimal: " + x + " - Binary: " + Integer.toBinaryString(x) + " (<< 1)");
    }


    // 4.    Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
    //
    //    Do the preceding exercise with the following values:
    //
    //        225
    //        1555
    //        32456
    public void problem4()
    {
        System.out.println();
        System.out.println("Operators & Numbers - Problem 4");

        problem4Helper(225);
        problem4Helper(1555);
        problem4Helper(32456);
    }

    private void problem4Helper(int num)
    {
        int x = num;
        System.out.println("Decimal: " + x + " - Binary: " + Integer.toBinaryString(x));

        x = x >> 2;
        System.out.println("Decimal: " + x + " - Binary: " + Integer.toBinaryString(x) + " (>> 2)");
    }


    // 5.    Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y. Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
    //
    //    Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y. As before, write a comment that indicates what you predict the values to be before printing them out.
    public void problem5()
    {
        System.out.println();
        System.out.println("Operators & Numbers - Problem 5");

        int x = 7;
        int y = 17;
        System.out.println("X Decimal: " + x + " - Binary: " + Integer.toBinaryString(x));
        System.out.println("Y Decimal: " + y + " - Binary: " + Integer.toBinaryString(y));

        int z = x & y;
        System.out.println("Decimal: " + z + " - Binary: " + Integer.toBinaryString(z));

        z = x | y;
        System.out.println("Decimal: " + z + " - Binary: " + Integer.toBinaryString(z));
    }

    // 6.    Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value. Print the value before and after the increment operator.
    public void problem6()
    {
        System.out.println();
        System.out.println("Operators & Numbers - Problem 6");

        int x = 25;

        System.out.println(x);
        x++;
        System.out.println(x);
    }

    // 7.    Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times. Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.
    public void problem7()
    {
        System.out.println();
        System.out.println("Operators & Numbers - Problem 7");

        int x = 1;

        System.out.println(x);
        x++;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        ++x;
        System.out.println(x);
    }

    // 8.    Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y and print the result. Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of sum is. The first configuration incremented x and then calculated the sum while the second configuration calculated the sum and then incremented x.
    public void problem8()
    {
        System.out.println();
        System.out.println("Operators & Numbers - Problem 8");

        int x = 5;
        int y = 8;

        int sum = x++ + y;
        System.out.println(sum);

        sum = ++x + y;
        System.out.println(sum);
    }


}
