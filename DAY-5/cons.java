

class cons{
    public static void main(String[] args) {
        constructors a = new constructors("Sampath"); // sending the string to the constructor 
        constructors a2 = new constructors(a); // assign the a constructor to a2
        constructors a3 = new constructors();  // default constructor
        System.out.println(a.name);
        System.out.println(a2.name2);
    }
}

class constructors{
    String name;
    String name2;
    constructors(String nm ) {
        name = nm;
    }
    constructors(constructors x) {
        name2 = x.name;
    }
}