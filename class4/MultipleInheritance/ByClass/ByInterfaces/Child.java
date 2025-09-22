
interface Parent1 {

    default void ParentClass1() {
        System.out.println("Parent1 class method p1");
    }
}

interface Parent2 {

    default void ParentClass2() {
        System.out.println("Parent2 class method p2");
    }
}

class Child implements Parent1, Parent2 {

    public void msg() {
        System.out.println("Child class method c1");
    }

    public static void main(String[] args) {
        System.out.println("Multiple inheritance");
        Child c1 = new Child();
        c1.msg();
        c1.ParentClass1();
        c1.ParentClass2();
    }

}
