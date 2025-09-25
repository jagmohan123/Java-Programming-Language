
class Wrapperclass {

    public static void main(String[] args) {
        //  System.out.println("Wrapper class");

        //Autoboxing
        // int x = 10;
        // Integer y = 167;
        // Integer i2 = Integer.valueOf(x);// es concept ko autoboxing bolte hai or ese aap manually karte hai
        // Integer i3 = x;// this is a moder way also known as autoboxing
        // System.out.println("The value of x which is a primitive type =>=>" + x);
        // System.out.println("The value of y which is a wrapper class Integer =>=>" + y);
        // System.out.println("My x  became object  earlier it was primitive now the value" + i2);
        // System.out.println("My x  became object  earlier it was primitive now the value" + i3);
        //Unboxing
        // Integer ob = new Integer(10);
        Integer ob=10;
        int age = ob.intValue();// ye ho gya manual way of doing unboxing 
        int ageData = ob;//This is the automatic way of unboxing 
        System.out.println("The value of ob which is wrapper class i.e object" + ob);
        System.out.println("The value of age which store wrapper class ob value i.e primitive" + age);
        System.out.println("The value of age which store wrapper class ob value i.e primitive" + ageData);

    }
}
