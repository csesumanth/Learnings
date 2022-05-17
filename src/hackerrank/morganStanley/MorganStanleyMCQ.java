package hackerrank.morganStanley;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.*;

public class MorganStanleyMCQ {
    enum Animals{
        LION,DOG,COW;
    }
    private static String temp = "1";

    public static void main(String[] args) {
//        String s1 = "hello";
//        s1 += "world";
//        String s2 = "hello";
//        s2 += "";
//        s2 += "world";
//        String s3 = s1.intern();
//        String s4 = s2.intern();
//        boolean b1 = s3==s4;
//        boolean b2 = s3.equals(s4);
//        System.out.println(b1+" "+b2);

//        Integer n  = 10;
//        n++;
//        System.out.println(n);
//        assert n==null && n>=0;
//        System.out.println(n);

//        Animals[] animals = Animals.values();
//        System.out.println(animals[1]);

        Map<Color,String> map = new HashMap<>();
        map.put(new Color("Red"), "Red");
        System.out.println(map.size());
        System.out.println(map.get(new Color("Red")));



//        new MorganStanleyMCQ().firstMethod();
//        System.out.println(temp);

//        Set<? extends IOException> set = new TreeSet<IOException>();
//        Set<? extends IOException> set1 = new TreeSet<FileNotFoundException>();

    }

//    private void firstMethod(){
//        try{
//            secondMethod();
//        }catch (Exception e){
//            temp +=5;
//        }
//    }
//    private void secondMethod()  throws Exception{
//        try {
//            thirdMethod();
//            temp +=3;
//        }catch (Exception e){
//            throw new Exception();
//        }finally {
//            temp +=4;
//        }
//        temp +=5;
//    }
//    private void thirdMethod() throws Exception{
//
//            throw new Exception();
//
//    }
}

class Color{
    private String name;
    public Color(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object anObject){
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
//    @Override
//    public String toString() {
//        return name;
//    }
}

