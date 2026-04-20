public class Order {
    private int orderID;
    private Customers cust;
    private Merchandise item;
    private String paymentMethods;

    public Order(int a, Customers b, Merchandise c, String d){
        orderID = a;
        cust = b;
        item = c;
        paymentMethods = d;
    }

    public int getOrderID(){
        return orderID;
    }
    public String getPaymentMethods(){
        return paymentMethods;
    }
    
    public double calcOrderPrice() {
    double total = item.calcMerchPrice() * item.getAmount();
    if (cust.isStudent()){
        total *= 0.85; // 15% discount
    }
    return total;
}

     public void paymentProcess(){
        double total = calcOrderPrice();
        System.out.println("\n--- Payment Information ---");
        System.out.println("Payment Method: " + paymentMethods);
        System.out.printf("Amount to Pay: RM%.2f\n", total);

        if (paymentMethods.equalsIgnoreCase("QRPay")) {
            System.out.println("Please scan the QR Code below:");

            System.out.println("$$**$$**$$**$$**$$**$$**$$\n"+ 
                                "**$$**$$**$$**$$**$$**$**\n"+ 
                                "$$**$$****$$**$$****$$**$\n"+ 
                                "**$$**$$**$$**$$**$$**$$*\n"+ 
                                "$$**$$**$$**$$**$$**$$**$\n"+ 
                                "****$$$$****$$$$****$$*$$\n"+ 
                                "$$**$$**$$**$$**$$**$$**$\n"+ 
                                "**$$**$$**$$**$$**$$**$$*\n"+ 
                                "$$**$$****$$**$$****$$**$\n"+ 
                                "**$$**$$**$$**$$**$$**$$*\n"+ 
                                "$$**$$**$**$$**$$**$$**$*");

            System.out.println("[QR CODE SCANNED]");
        } else if (paymentMethods.equalsIgnoreCase("Credit Card") || paymentMethods.equalsIgnoreCase("Debit Card")) {
            System.out.println("Please tap / wave your card here...");
            System.out.println("Processing card payment...");
            System.out.println("Payment Successful!");
        } else {
            System.out.println("Invalid payment method.");
        }
    }

     public void displayOrderSummary() {
        System.out.println("===== ORDER SUMMARY =====");
        System.out.println("Order ID: " + orderID);
        cust.display();
        item.display();
        System.out.printf("Total Price: RM%.2f\n", calcOrderPrice());
        paymentProcess();
    }
}
