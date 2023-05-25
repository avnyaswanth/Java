package main.sample;

public class NestedClassMain {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.setIcs("innerclass");
        innerClass.setY(10);
        System.out.println(outerClass);
        System.out.println(innerClass);
    }

    // Generally we use inner classes as static to access them with the class name
    // If the innerclass is not static then we have to instantiate the outer class first then call the innerclass
    // constructor with the outer class object like.. (outerclass.new InnerClass()).
}
