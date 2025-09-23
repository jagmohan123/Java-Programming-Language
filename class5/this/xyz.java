
class xyz {

    private int x;
    private int y;

//this is the worng way
    // xyz(int x, int y) {
    //     x = x;
    //     y = y;
    // }
    xyz(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printValue() {
        System.out.println("x " + x + "  y " + y);
        System.out.println("This keyword refer to  " + this);
    }

    public static void main(String[] args) {
        xyz ob = new xyz(10, 20);
        ob.printValue();
    }
}
