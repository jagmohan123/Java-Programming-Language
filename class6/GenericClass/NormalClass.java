
class NormalClass {

    public int sumofTwoNum(int x, int y) {
        return x + y;
    }

    public float sumofTwoNum(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        NormalClass n1 = new NormalClass();
        System.err.println("sum of no." + n1.sumofTwoNum(10, 20));
        NormalClass n2 = new NormalClass();
        System.err.println("sum of no." + n2.sumofTwoNum(10.6f, 20.8f));

    }
}
