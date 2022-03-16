package com.socgen;

import jdk.swing.interop.SwingInterOpUtils;

public class FloatDouble {
    public static void main(String[] args) {
        float myMinFloatValue= Float.MIN_VALUE;
        float myMaxFloatValue= Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMaxFloatValue);
        System.out.println("Float maximum value ="+myMaxFloatValue);

        double myMinDoubleValue= Double.MIN_VALUE;
        double myMaxDoubleValue= Double.MAX_VALUE;
        System.out.println("Double minimum value = "+myMaxDoubleValue);
        System.out.println("Double maximum value ="+myMaxDoubleValue);
    }
}
