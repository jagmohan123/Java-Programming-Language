
class Parent {

    public String name = "Jagmohan";

    public Parent() {
        System.out.println("I am the constructor of parent class");
    }

    public Parent(String name) {
        System.out.println("I am the constructor of parent class with parameter" + name);
    }

    public void msg() {
        System.out.println("I am parent class =>msg() method");
    }
}

class Child extends Parent {

    public String name = "Mohan";

    public Child() {
        super("Jagmohan");
        // super();
        System.out.println("I am the constructor of child class");
    }

    public void msg() {
        super.msg();
        System.out.println("I am child class =>msg() method");
    }

    public void msgChild() {
        System.out.println("I am  child class=> msgChild() method");
    }

    public void PrintName() {
        System.out.println("name variable kee value in parent class " + super.name);
        System.out.println("name variable kee value in child class " + name);
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.msgChild();
        c1.msg();
        c1.PrintName();
    }
}
