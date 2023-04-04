class A {
    final void display(){
        System.out.println("This is parent method final");
    }
}
class B extends A{
    void display(){
        System.out.println("This is chila method");
    }
}
class FinalDemo {
    public static void main(String[] args) {
        A o1 = new A();
        o1.display();
    }
}
