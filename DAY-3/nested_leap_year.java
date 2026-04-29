class nested_leap_year{
    public static void main(String[] args) {
        int year = 2000;
        if(year%4==0)
        {
            if(year%100!=0)
            {
                System.out.println("It is a leap Year");
            }
            
            if(year%400==0){
                System.out.println("It is a leap Year");
            }
            
        }
        else{
               System.out.println("It is not a leap Year"); 
            }
    }
}