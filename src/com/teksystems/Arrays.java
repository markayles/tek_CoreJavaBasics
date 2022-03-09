package com.teksystems;

public class Arrays
{
    public void run()
    {
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
        problem8();
        problem9();
        problem10();
    }


    // 1,   Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
    private void problem1()
    {
        System.out.println();
        System.out.println("Arrays - Problem 1");

        int[] ints = {1, 2, 3};

        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(i);
        }
    }


    // 2.   Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
    private void problem2()
    {
        System.out.println();
        System.out.println("Arrays - Problem 2");

        int[] ints = {13, 5, 7, 68, 2};

        System.out.println(ints[ints.length / 2]);
    }


    // 3.   Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    private void problem3()
    {
        System.out.println();
        System.out.println("Arrays - Problem 3");

        String[] sArr = {"red", "green", "blue", "yellow"};
        System.out.println("Length: " + sArr.length);

        String[] sArr2 = sArr.clone();
        System.out.println("Orig: " + sArr.toString() + " New: " + sArr2.toString());
    }


    // 4.   Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
    private void problem4()
    {
        System.out.println();
        System.out.println("Arrays - Problem 4");

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums[0]);
        System.out.println(nums[nums.length - 1]);
        // System.out.println(nums[nums.length]); // index out of bounds exception
    }


    // 5.   Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
    private void problem5()
    {
        System.out.println();
        System.out.println("Arrays - Problem 5");

        int[] nums = new int[5];
        for (int i = 0; i < 5; i++)
        {
            int num = i;
            nums[i] = num;
            System.out.printf("[%d] = %d\n", i, num);
        }
    }


    // 6.   Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
    private void problem6()
    {
        System.out.println();
        System.out.println("Arrays - Problem 6");

        int[] nums = new int[5];
        for (int i = 0; i < 5; i++)
        {
            int num = i * 2;
            nums[i] = num;
            System.out.printf("[%d] = %d\n", i, num);
        }
    }


    // 7.   Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
    private void problem7()
    {
        System.out.println();
        System.out.println("Arrays - Problem 7");

        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++)
        {
            if (i == 2)
            {
                continue;
            }

            System.out.printf("[%d] = %d\n", i, nums[i]);
        }
    }


    // 8.   Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
    private void problem8()
    {
        System.out.println();
        System.out.println("Arrays - Problem 8");

        String[] arr = {"one", "two", "three", "four", "five"};

        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("[%d] = %s\n", i, arr[i]);
        }
    }

    // 9.   Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
    //
    //    Array in ascending order: 0, 1, 2, 4, 9, 13
    //
    //    The smallest number is 0
    //
    //    The biggest number is 13
    private void problem9()
    {
        System.out.println();
        System.out.println("Arrays - Problem 9");

        int[] nums = {4, 2, 9, 13, 1, 0};

        int largest = nums[0];
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > largest)
            {
                largest = nums[i];
            }
            if (nums[i] < smallest)
            {
                smallest = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.print("Array in ascending order: ");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]);

            if (i < nums.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.printf("The smallest number is %d\n", smallest);
        System.out.printf("The biggest number is %d\n", largest);
    }


    // 10.   Create an array that includes an integer, 3 strings, and 1 double. Print the array.
    private void problem10()
    {
        System.out.println();
        System.out.println("Arrays - Problem 10");

        Object[] arr = {1, "one", "two", "three", 2.25f};
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

}
