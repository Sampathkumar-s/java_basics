public class ordertracking {
    public static void main(String[] args) {
        StringBuffer status = new StringBuffer("Order Placed");
        
        status.append(" -> Packed");
        status.append(" -> Shipped");
        status.append(" -> Delivered");
        
        System.out.println(status.toString());
    }
}
