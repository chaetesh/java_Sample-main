class overloadDemo{
    void test(){
        System.out.println("No Parameters");
    }
    void test(int a){
        System.out.println("a: "+a);
    }
    void test(int a,int b){
        System.out.println("a: "+a);
    }
    double test(double a){
        System.out.println("double a: "+a);
        return a*a;
    }
}

class fiftyTwo {
    public static void main(String[] args) {
        overloadDemo ob = new overloadDemo();
        ob.test();
        ob.test(10);
        ob.test(10,20);
        double result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): "+result);
    }    
}
