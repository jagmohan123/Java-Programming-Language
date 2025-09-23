
interface Demo {

    int a = 10;
    public static final int a1 = 10;

    void msg();// abstract method es case me jo class interface ko implement karegi uske andar 
    // interface vali abstarct method ko override karna must imp hai.

    // interface ke andar java 8 aane se aap yha method ki body de ksate hai
    // aap ke pass ek hee tarika hai agar method kee body interface ke andar dena hai access specifier default hona chaheaye
    // public void showData() {
    //     System.out.println("I am showData() Method");
    // }
    default void showData() {
        System.out.println("I am showData() Method");
    }

}

public class Parent implements Demo {

    // @Override
    public void msg() {
        System.out.println("This is a msg() method inside the class parent");
    }

    public static void main(String[] args) {
        System.out.println(Parent.a);
        Parent p1 = new Parent();
        p1.showData();
        p1.msg();
    }
}
