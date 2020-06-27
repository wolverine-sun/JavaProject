package main.com.syh.jvm;

import java.util.Map;
import java.util.Set;

public class Java8GCTest {
    private static final int  _1Mb = 1024*1024;
    public static void main(String[] args) throws InterruptedException {
        byte[] allocation1, allocation2, allocation3, allocation4;
//        allocation1 = new byte[2*_1Mb];
//        allocation2 = new byte[2*_1Mb];
//        allocation3 = new byte[7*_1Mb];
//        allocation2 = null;
//        allocation4 = new byte[9*_1Mb];
//        int i = 0;
//
////            allocation1 = new byte[10];
//        System.out.println(i++);
//    }     while (true) {

        String s1="12344";
        String s2 ="12344";
        String s3 = new String("12344");
        String s4 = "java";
        System.out.println(s4.intern() == s4);
        System.out.println(s1==s2 );
        System.out.println(s1 ==s3 );
        System.out.println(s2 ==s3 );
    }}
