abstract class A {
    abstract void display();
    void show(){
        System.out.println("Hi");
    }
}
class B extends A{
    void display(){
        System.out.println("This is child method");
    }
    void happy(){
        System.out.println("Happy");
    }
    }

class AbstractDemo {
    public static void main(String[] args) {
        B o1 = new B();
        o1.display();
        o1.show();
        o1.happy();
    }
}
