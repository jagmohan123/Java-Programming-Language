
class GenericClass<T> {
    public T x;
    public GenericClass(T x) {
        this.x = x;
    }
    public T getValue() {
        return x;
    }
    public static void main(String[] args) {
        // GenericClass ob=new GenericClass();// you can not create object like this
        GenericClass<Integer> ob = new GenericClass<>(20);
        System.err.println(ob.getValue());
        GenericClass<String> ob1 = new GenericClass<>("Jagmohan");
    }
}

// class GenericClass<Jagmohan> {

    // public Jagmohan x;
    // public GenericClass(Jagmohan x) {
    //     this.x = x;
    // }
    // public Jagmohan getValue() {
    //     return x;
    // }
    // public void sumofTwoNum(Jagmohan x1, Jagmohan y1) {
    //     System.out.println(x1 + y1);
    // }

    // public static void main(String[] args) {
        // GenericClass ob=new GenericClass();// you can not create object like this
        // GenericClass<Integer> ob = new GenericClass<>(20);
        // System.err.println(ob.getValue());
        // GenericClass<String> ob1 = new GenericClass<>("Jagmohan");

//         GenericClass<Integer> st1 = new GenericClass<>();
//         st1.sumofTwoNum(10, 20);

//     }
// }



// class GenericClass<T extends Number> {

//     public void sumofTwoNum(T x1, T y1) {
//         System.out.println(x1.doubleValue() + y1.doubleValue());
//     }

//     public static void main(String[] args) {
//         GenericClass<Integer> st1 = new GenericClass<>();
//         st1.sumofTwoNum(10, 20);

//         GenericClass<Double> st2 = new GenericClass<>();
//         st2.sumofTwoNum(10.5, 20.7);
//     }
// }


