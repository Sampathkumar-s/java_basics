class sample{
    public static void main(String[] args){
        sample2 a = new sample2();
        
        a.add();
        System.out.println(a.s);
    }
}

class sample2{
    int a = 20;
    void add(){
        int a=10;
        System.out.println(a);
    }
}