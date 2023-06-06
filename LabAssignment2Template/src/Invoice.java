public class Invoice {
    int id;
    String description;
    int quantity;
    double unitPrice;
    boolean paid;


    Invoice(int ID, String Description, int Quantity, double UnitPrice){
        paid = false;
        id = ID;
        description = Description;
        quantity = Quantity;
        unitPrice = UnitPrice;


    }

    public String toString(){
        return "Invoice[" + "id=" + id +
                ", description=" + description +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", paid=" + paid +
                ']';
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
