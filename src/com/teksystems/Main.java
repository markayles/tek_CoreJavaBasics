package com.teksystems;

public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();

        m.problem1();
        m.problem2();
        m.problem3();
        m.problem4();
        m.problem5();
        m.problem6();
        m.problem7();
        m.problem8();

        OperatorsAndNumbers o = new OperatorsAndNumbers();
        o.run();
    }

    // Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.
    public void problem1()
    {
        System.out.println();
        System.out.println("Problem 1");

        int a = 1;
        int b = 2;

        int sum = a + b;

        System.out.println("Sum " + sum);
    }

    // Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
    public void problem2()
    {
        System.out.println();
        System.out.println("Problem 2");

        double a = 2.25;
        double b = 1.23;

        double sum = a + b;

        System.out.println("Sum " + sum);
    }

    // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?
    public void problem3()
    {
        System.out.println();
        System.out.println("Problem 3");

        int a = 25;
        double b = 1.23;

        double sum = a + b;

        System.out.println("Sum " + sum);
    }

    // Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
    public void problem4()
    {
        System.out.println();
        System.out.println("Problem 4");

        int a = 25;
        int b = 3;

        double quotient = a / b;
        double quotientDouble = (double) a / b;

        System.out.println("Quotient (int) " + quotient);
        System.out.println("Quotient (dbl) " + quotientDouble);
    }

    // Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
    public void problem5()
    {
        System.out.println();
        System.out.println("Problem 5");

        double a = 1.22;
        double b = 2.25;

        double c = b / a;

        System.out.println(c);
        System.out.println((int) c);
    }

    // Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
    public void problem6()
    {
        System.out.println();
        System.out.println("Problem 6");

        int x = 5;
        int y = 6;

        double q = y / x;
        System.out.println(q);

        q = (double) y / x;
        System.out.println(q);
    }

    // Write a program that declares a named constant and uses it in a calculation. Print the result.
    public void problem7()
    {
        System.out.println();
        System.out.println("Problem 7");

        final int MY_CONSTANT = 25;
        int a = 5;

        System.out.println(MY_CONSTANT / a);
    }

    // Write a program where you create 3 variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to 2 decimal places.
    public void problem8()
    {
        System.out.println();
        System.out.println("Problem 8");

        final double SALES_TAX = 0.06;

        double coffee = 2.50;
        double donut = 1.00;
        double sandwich = 4.30;

        double subtotal = 0;
        double totalSale = 0;
        double totalTax = 0;

        subtotal += coffee * 3;
        subtotal += donut * 4;
        subtotal += sandwich * 4;
        System.out.format("Subtotal: $%.2f\n", subtotal);

        totalTax = subtotal * SALES_TAX;
        System.out.format("Tax: $%.2f\n", totalTax);

        totalSale = subtotal + totalTax;
        System.out.format("Total sale: $%.2f\n", totalSale);
    }


}
