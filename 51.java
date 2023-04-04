class superClass{
    int a = 10;
    void show(){
        System.out.println("Super class a value is "+a);
    }
}
class subclass extends superClass{
    int a = 10;
    int sum;
    void show(){
        super.show();
        System.out.println("Subclass a value is "+a);
    }
    void sum(){
        System.out.println("Sum="+(super.a+a));
    }
}

class fiftyOne {
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.show();
        obj.sum();
    }
}
