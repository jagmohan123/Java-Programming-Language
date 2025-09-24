
class CompileTimePolymorphism {

    public void sum(int x, int y) {
        System.out.println("Sum of 2 no is " + (x + y));

    }

    public void sum(int x, int y, int z) {
        System.out.println("Sum of 3 no is " + (x + y + z));
    }

    public void sum(int x, int y, int z, int a) {
        System.out.println("Sum of 4 no is " + (x + y + z + a));
    }

    public static void main(String args[]) {
        CompileTimePolymorphism c1 = new CompileTimePolymorphism();
        c1.sum(10, 20);
        c1.sum(10, 20, 30);
        c1.sum(10, 20, 30, 40);
    }

}
