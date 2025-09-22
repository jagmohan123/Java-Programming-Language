
class Parent1 {

    public void ParentClass() {
        System.out.println("I am a Parent class method");
    }
}

class Parent2 {

    public void ParentClass() {
        System.out.println("I am a Parent class method");
    }
}


// In Java, you cannot extend multiple classes simultaneously due to the lack of support for
//  multiple inheritance of classes. This is a fundamental design decision in Java to avoid the "diamond problem" and complexity.

// class Child extends Parent1, Parent2{

//     public static void main(String[] args) {
//         System.out.println("Multiple inheritance");
//     }

// }
