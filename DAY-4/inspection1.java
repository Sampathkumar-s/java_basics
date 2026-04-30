class inspection1{
    public static void main(String[] args) {
       String s = "KEC ECE";
       String a = "KEC IT";
       System.out.println(s.length()); 
       System.out.println(s.isEmpty()); //consider no space 
       System.out.println(s.isBlank()); //condiser the space 
       System.out.println(s.equals(a)); // compare the content with case
       System.out.println(s.equalsIgnoreCase(a)); // do not check the case 
       System.out.println(s.compareTo(a));  //
       System.out.println(s.contains(s));  // check the string is present in it or not and it is a case sensitive
       System.out.println(s.charAt(0));
       System.out.println(s.substring(1,2));
        System.out.println(s.indexOf('e')); //indexof return the position of the charater in the string
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.strip());
        System.out.println(s.trim());
        System.out.println(s.replace("E","T"));
       // System.out.println(s.toUpperCase());
        //System.out.println(s.toLowerCase());
        System.out.println(s.repeat(2));
        System.out.println(s.startsWith(s));
        System.out.println(s.endsWith(s));



    }
}
