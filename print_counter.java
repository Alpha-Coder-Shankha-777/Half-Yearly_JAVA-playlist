
class print_counter {
    public static void main (String[] args) {
        int c = 10;
        for (int i = 1; i<=10; i++) {
            System.out.print(i+", ");
            c++;
        }
        System.out.println("The value of counter is: "+c);
    }
}