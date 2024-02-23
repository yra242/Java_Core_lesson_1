import java.util.Random;

public class Main {
    public static void main(String[] args) {
        byte myByte = 57;
        short myShort = 342;
        int myInt = 2357;
        long myLong = 678453l;
        float myFloat = 3.14f;
        double myDouble = 2.71;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("max: " + maxInt);
        System.out.println("miv: " + minInt);

        int[] mass = new int[10];
        maxInt = Integer.MIN_VALUE;
        minInt = Integer.MAX_VALUE;
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(500);
        }
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]<minInt){minInt=mass[i];}
            if(mass[i]>maxInt){maxInt=mass[i];}
        }
        System.out.println("min = " + minInt + " max = " + maxInt);
    }
}