
class Parent {

    public void showMsg() {
        System.out.println("Show method of Parent class");
    }
}

class ParentChild extends Parent {

    public void showMsgOfChild() {
        System.out.println("showMsgOfChild method of child class");
    }
    public static void main(String[] args) {
        ParentChild ob = new ParentChild();
        ob.showMsgOfChild();
        ob.showMsg();

    }
    
}
