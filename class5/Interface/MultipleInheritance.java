
interface Parent1 {

    default void greetToParent1() {
        System.out.println("Good night Parent1 class");
    }
}

interface Parent2 {
    default void greetToParent2() {
        System.out.println("Good night Parent2 class");
    }
}

class MultipleInheritance implements Parent1, Parent2 {
    void showGreet() {
        System.out.println("This is a class method");
    }
    public static void main(String[] args) {
        MultipleInheritance m1 = new MultipleInheritance();
        m1.showGreet();
        m1.greetToParent1();
        m1.greetToParent2();
    }
}
