class Parent {
    void saySomething(){
        System.out.println("parent");
    }
}

class Child1 extends Parent{
//    @Override
    void saySomething(){
        System.out.println("child one");
    }
}

class Child2 extends Parent{
//    @Override
    void saySomething(){
        System.out.println("child two");
    }
}


class Test{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child1();
        Parent p3 = new Child2();
        p1.saySomething();
        p2.saySomething();
        p3.saySomething();
    }
}


