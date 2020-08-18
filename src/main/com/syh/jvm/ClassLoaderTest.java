package main.com.syh.jvm;

public class ClassLoaderTest {
    static {
        System.out.println("main static block");
    }
    public static void main(String[] args) {
        SubClass subClass = new SubClass();//父static，子static，父init，子init
//        System.out.println(SubClass.staticField);//父static
//        SubClass[] subClasses = new SubClass[1];//不会产生任何的初始化

    }
}
class SuperClass{
    public static String staticField = "static field";
    static {
        System.out.println("Super static block");
    }
    SuperClass(){
        System.out.println("Super static init");
    }
}

class SubClass extends  SuperClass{
    static {
        System.out.println("sub static block");
    }
    SubClass(){
        System.out.println("sub static init");
    }
}