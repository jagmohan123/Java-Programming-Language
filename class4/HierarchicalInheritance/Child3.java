
class Parent {

    public void ParentClass() {
        System.out.println("I am a Parent class method");
    }
}

class Child1 extends Parent {

    public void child1Class() {
        System.out.println(" c1=>I am a child1Class class method");
    }
}

class Child2 extends Parent {

    public void child2Class() {
        System.out.println("c2=>I am a child2 class method");
    }
}

class Child3 extends Parent {

    public void child3Class() {
        System.out.println("c3=>I am a child3 class method");
    }

    public static void main(String[] args) {
        Child3 c3 = new Child3();
        Child2 c2 = new Child2();
        Child1 c1 = new Child1();
        c1.child1Class();
        c1.ParentClass();
        c2.child2Class();
        c2.ParentClass();
        c3.child3Class();
        c3.ParentClass();

    }
}
