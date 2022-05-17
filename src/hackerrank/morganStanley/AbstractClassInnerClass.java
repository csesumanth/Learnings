package hackerrank.morganStanley;

public abstract  class AbstractClassInnerClass {
    public String str;
//    public abstract final void sendMessage();
     public abstract void sendMessage();

    public static void main(String[] args) {
        AbstractClassInnerClass abstractClassInnerClass = new Child();
        abstractClassInnerClass.str = "123";
        abstractClassInnerClass.sendMessage();
    }
    static class Child extends AbstractClassInnerClass {
        public final void sendMessage(){
            System.out.println("test " + str);
        }
    }
}
