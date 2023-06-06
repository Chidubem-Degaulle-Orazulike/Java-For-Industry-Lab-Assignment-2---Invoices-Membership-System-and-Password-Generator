public class Q1Main {
    public static void main(String[] args) {
        Invoice item1 = new Invoice(1234,"Pedal arms",50,25.00);
        Invoice item2 = new Invoice(12345,"Pedal arms and legs",10,15.00);

        item1.paid = true;
        item2.paid = true;

        System.out.println(item1.toString());
        System.out.println(item2.toString());


    }
}
