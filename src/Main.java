import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main extends Thread{
//    Main(){
////        super("My thread");
//        start();
//    }
//    public static void main(String[] args) {
////        System.out.println("Hello world!");
//        new Main().start();
//    }
//        boolean b1 = b instanceof B;
//        System.out.println("b instanceof B = "+ (b instanceof B));
//        System.out.println("b instanceof A = "+ (b instanceof A));
//        System.out.println("b instanceof C = "+ (b instanceof C));

//        Set<Integer> integerSet = new HashSet<>();

        public void run(){
            System.out.println("Run");
//        try{
//            System.out.println("starting to wait");
//            wait(1000);
//            System.out.println("done wait");
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
    }
}
class A{
    int a = 10;
    public void print(){
        System.out.println("A");
    }
}
class B extends A{
    int b = 20;
    public void print(){
        System.out.println("B");
    }
}
class C extends A{
    public void print(){
        System.out.println("C");
    }
}
class Test extends Exception{}
class D {
    public static void main(String[] args) {
//        new Main().run();
//        String s1 = new String("hi");
//        String s2 = new String("hi");
//        String s3 = s1;
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s2));
//        System.out.println(s2.equals(s3));
//        Integer n1 = 10;
//        Integer n2 = 10;
//        if(n1==n2){
//            System.out.println("true");
//        }

//        Map<String, String> hashMap = new HashMap<>();
//        hashMap.put(new String("a"),"audi");
//        hashMap.put(new String("a"),"ferrari");
//        System.out.println(hashMap);

//        Lock lock = new ReentrantLock();
//        try{
//            System.out.println("lock 1");
//            lock.lock();
//            System.out.println("CS 1");
//            System.out.println("lock 2");
//            lock.lock();
//            System.out.println("CS 2");
//        } finally {
//            lock.unlock();
//            System.out.println("unlock 2");
//            lock.unlock();
//            System.out.println("unlock 1");
//        }

//        A a = new B();
//        System.out.println(a.a);
////        System.out.println(a.b); // compile error, after upcasting, sub class prop are hidden
//        B b = (B)a;
//        System.out.println(b.a);
//        System.out.println(b.b);// After downcasting upcasted reference, we can access sub class prop
//        b.print();
////        C c = (C)a;
//        a.print();
////        c.print();

//        Map<Integer,String> hm = new TreeMap<>();
//        hm.put(11,"Z");
//        hm.put(12,"A");
//        hm.put(null,"C");   //null pointer exception
//        System.out.println(hm.size());
//        System.out.println(hm);

        Demo demo = new Demo();
        demo.show();
    }
}

class Demo{

    public void show() {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list.getFirst());
    }
}