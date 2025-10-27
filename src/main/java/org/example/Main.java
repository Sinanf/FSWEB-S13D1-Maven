package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if ( clock < 0 || clock > 23) {
            return false;
        }
        if (!isBarking) {
            return false;
        }
        return clock < 8 || clock > 22;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    public static boolean isTeen(int age) {
       return age >= 13 && age <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     int upper = isSummer ? 45 : 35;
     return temp >= 25 && temp <= upper;
    }

    public static double area(double width, double height) {
       if( width < 0 || height < 0) {
           return -1;
       }
       return width * height;
    }

    public static double area(double radius) {
       if (radius < 0) {
           return -1;
       }
       return Math.PI * radius * radius;
    }
}
