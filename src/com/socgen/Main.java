package com.socgen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue=1000;
        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println(myMaxIntValue);
        System.out.println(myMinIntValue);

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Integer Minimum Value= "+ myMinByteValue);
        System.out.println("Integer Maximum Value= "+ myMinByteValue);

        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Integer Minimum Value= "+ myMinLongValue);
        System.out.println("Integer Maximum Value= "+ myMinLongValue);

        int myTotal= (myMinIntValue/2);
        byte myNewByteValue=(byte)(myMinByteValue/(2));

    }
}
//// overflow and underflow of integer