
class Parent {

// below is the static method or static method ko call karne ke leate class ke object kee need nhi hoti hai
// class ka name likho or dot lagakar ke method ka name likho call ho jati/
    public static void greetHuman() {
        System.out.println("Good night everyone");
    }

    public static void main(String[] args) {
        Parent.greetHuman();
    }
}
