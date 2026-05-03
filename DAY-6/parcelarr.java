class parcelarr{
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 4;
        arr[3] = 32;
        arr[4] = 15;

        arr[2] = 19;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Parcel Number: " + arr[i]);
        }
    }
}