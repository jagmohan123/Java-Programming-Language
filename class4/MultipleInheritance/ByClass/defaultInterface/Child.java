
interface Parent1 {
    void drink();
}

interface Parent2 {
    void eat();
}

class Child implements Parent1, Parent2 {

    public void drink() {
        System.out.println("I am overriding parent1 drink Method");
    }

    public void eat() {
        System.out.println("I am overriding parent2 drink Method");
    }

    public void HumanDrink() {
        System.out.println("i am human class method ");
    }

    public static void main(String[] args) {
        System.out.println("This is a Human Class Main method ");

        Child h1 = new Child();
        h1.eat();
        h1.drink();
        h1.HumanDrink();
    }

}
