class sample{
    public static void main(String[] args){
        sample2 a = new sample2();
        
        a.add();
        System.out.println(a.a);
        System.out.println(sample2.b); // instace variable cannot be accessed by class name, but static variable can be accessed by class name
    }
}

class sample2{
    int a = 20;
    static int b = 30;

    void add(){
        final int c = 40; 
        int a=10;
        System.out.println(a);
        System.out.println(c);
    }
}