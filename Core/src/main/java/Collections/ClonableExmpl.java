package Collections;

public class ClonableExmpl {
    public static void main(String[] args) throws Exception {
        SomeUser someUser = new SomeUser();
        someUser.i = 5;

        SomeUser someUser1 = someUser.clone();
//        SomeUser someUser1 = someUser;
        someUser1.i = 10;

        System.out.println(someUser.i);

    }
}

class SomeUser implements Cloneable{
//class SomeUser{
    int i;

    @Override
    protected SomeUser clone() throws CloneNotSupportedException {
        return (SomeUser) super.clone();
    }
}
