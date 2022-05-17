package hackerrank.morganStanley;

public class PrivateInnerClass {
    public static void main(String[] args) {
        PrivateInnerClass privateInnerClass = new PrivateInnerClass();
        MyInnerClass myInnerClass = privateInnerClass.new MyInnerClass();
    }
    private class MyInnerClass{

    }
}
