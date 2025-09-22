
interface child {

    int age = 10;// public  static  final  int ho jayega jo by default
    public static final int age1 = 10;

    default void increAge() {
        // age++;// you can not modify the value of age 
    }

    // esi method jiski koi body nhi hoti hai use abstract method bola jata hai
    void msg();// by default interface kee method abstract and public hoti hai make sure jo bhi class es 
    // interface ko implement karga useke andar es method ko override karna padega 
}

class Single implements child {

// make sure kee aap interface kee method publically (public) override kare 
    public void msg() {
        System.err.println("Method");
    }

    public static void main(String[] args) {
        Single s1 = new Single();
        System.out.println(Single.age);
        // System.out.println(s1.age++);// you can not update interface variable
    }
}
