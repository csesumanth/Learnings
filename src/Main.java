import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;

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
    int c = 18;
    public void print(){
        System.out.println("C");
    }
}
class Test extends Exception{}
class D {
    public static void main(String[] args) throws Exception {
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

//        Demo demo = new Demo();
//        demo.show();

//        String a = new String("av");
//        if(a.equalsIgnoreCase("av")){
//            a = "abcd";
//        }
//        System.out.println(a);
//
//        A x = new B();
//
//        A y = new C();
//
//        x = y;

//Object[] objects = {
//        new Integer(12),//class java.lang.Integer cannot be cast to class java.lang.String
//        new String("foo"),
//        new Integer(5),
//        new Boolean(true)
//};
//Arrays.sort(objects);
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i].toString());
//        }


//        MyAdd<Number> myAdd = new MyAdd<>();
//        myAdd.add(new Integer(1));
//        myAdd.add(new Double(1.0));

//        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
//        deque.offerLast(10,5, TimeUnit.SECONDS);
//        System.out.println(deque.pollLast(5,TimeUnit.SECONDS));
//        System.out.println(deque.pollFirst(5,TimeUnit.SECONDS));

//        System.out.println(check(new ArrayList(), al->al.isEmpty()));//true
//        System.out.println(check(new ArrayList(), al->al.add("hey")));//true

//        String str = "abcde";
//        str.trim();
//        str.toUpperCase();
//        str.substring(3, 4);
//        System.out.println(str);//abcde

//        new D().foo("123");
    }

    public static boolean check(List l, Predicate<List> p){
        return p.test(l);
    }

    public void  foo(Integer integer){
        System.out.println("Integer");
//        return null;
    }

    public void foo(String string){
        System.out.println("String");
//        return null;
    }
}
class MyAdd<T>{
    void add(T t){

    }
}
class Demo{

    public void show() {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list.getFirst());
    }

}