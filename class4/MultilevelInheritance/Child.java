
class GrandParent {
     public void GrandParentClass() {
        System.out.println("I am a GrandParent class method");
    }
}

class Parent extends GrandParent {

    public void ParentClass() {
        System.out.println("I am a parent class method");
    }
}

class Child extends Parent {
 public void childClass() {
        System.out.println("I am a child class method");
    }
    public static void main(String[] args) {
        Child c1=new Child();
        c1.childClass();
        c1.ParentClass();
        c1.GrandParentClass();
    }
    
}


