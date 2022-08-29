package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value: "+minValue);
        System.out.println("Integer Max Value: "+maxValue);
        System.out.println("Busted - Overflow: "+ (maxValue+1));
        System.out.println("Busted - Underflow: "+ (minValue-1));

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Min Byte: "+minByte);
        System.out.println("Max Byte: "+maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Min Short: "+minShort);
        System.out.println("Max Short: "+maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Min Long: "+minLong);
        System.out.println("Max Long: "+maxLong);

        int newInt = (minValue/2);
        short newShort = (short)(minShort/2);
        byte newByte = (byte)(minByte/2);

        byte chByte = 100;
        short chShort = 2000;
        int chInt = 300000;
        long chLong = 50000 + 10*(chByte+chShort+chInt);
        System.out.println("Challenge Long: "+chLong);
    }
}
