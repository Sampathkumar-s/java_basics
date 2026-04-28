class sample{
    public static void main(String[] args){
        sample2 a = new sample2();
        
        a.add();
        System.out.println(a.a);
        System.out.println(sample2.b);
    }
}

class sample2{
    int a = 20;
    static int b = 30;
    void add(){
        int a=10;
        System.out.println(a);
    }
}