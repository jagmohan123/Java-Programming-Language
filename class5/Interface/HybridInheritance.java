
class GrandFather {

    public void msgToGrandFather() {
        System.out.println("Good mouring Grand Paa!!!!!!!!");
    }
}

class Father extends GrandFather {

    public void msgToFather() {
        System.out.println("Good mouring  Paa!!!!!!!!");
    }
}

class child extends Father {

    public void greetTo(String name) {
        System.out.println(name + "  nameste kar rha hai");
    }

}

class HybridInheritance extends child {

    public static void main(String[] args) {
        HybridInheritance h1 = new HybridInheritance();
        h1.greetTo("Mohan");
        h1.msgToGrandFather();
        h1.msgToFather();

    }
}
