class cons{
    public static void main(String[] args) {
        constructor a = new constructor("Sampath");
        System.out.println(a.name);
    }
}

class constructor{
    String name;

    constructor(String nm ) {
        name = nm;
    }
    
}