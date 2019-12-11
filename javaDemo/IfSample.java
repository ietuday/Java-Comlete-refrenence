package javaDemo;

class IfSample {
    public static void main(final String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y)
            System.out.println("X is less than y");

        x = x * 2;
        if (x == y)
            System.out.println("X now equal to y");

        x = x * 2;
        if (x > y)
            System.out.println("x now greater than y");

        if (x == y)
            System.out.println("You won't see this");
    }
}