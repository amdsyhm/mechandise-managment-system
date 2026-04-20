import java.util.*;
public class UiTM2025MerchandiseApplications {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
         System.out.println("Enter the amount of order: ");
         int OrderCount = a.nextInt();
         a.nextLine();
        Order[] ord = new Order[OrderCount];
        Customers [] cust = new Customers[OrderCount];
        Merchandise [] merch = new Merchandise[OrderCount];

        for (int i = 0; i < ord.length; i++) {
            System.out.println("\n=== ORDER " + (i + 1) + " ===");

            // Customer details
            System.out.print("Enter customer name: ");
            String name = a.nextLine();

            System.out.print("Enter phone number: ");
            String phone = a.nextLine();

            System.out.print("Enter email: ");
            String email = a.nextLine();

            System.out.print("Are you a student? (yes/no): ");
            boolean isStudent = a.nextLine().equalsIgnoreCase("yes");

            // Merchandise details
            System.out.print("Enter merch category (MPP / JPK / JSP): ");
            String merchCategory = a.nextLine();

            System.out.println("Enter merch item type (MPP - Jersey, Lanyard, Corporate Clothes, Tote Bag)");
            System.out.println("(JPK - Jersey, Hoodie, Necktie)");
            System.out.println("(JSP - Jersey, Jacket): ");
            String itemType = a.nextLine();

            System.out.print("Enter quantity: ");
            int amount = a.nextInt();
            a.nextLine(); // clear buffer

            if (merchCategory.equalsIgnoreCase("MPP")) {
                merch[i] = new MerchMPP(merchCategory, amount, itemType);
            } else if (merchCategory.equalsIgnoreCase("JPK")) {
                merch[i] = new MerchJPK(merchCategory, amount, itemType);
            } else if (merchCategory.equalsIgnoreCase("JSP")) {
                merch[i] = new MerchJSP(merchCategory, amount, itemType);
            } else {
                System.out.println("Invalid merchandise category.");
                i--; // Retry this order
                continue;
            }

            // Payment details
            System.out.print("Enter payment method (QRPay / Credit Card / Debit Card): ");
            String paymentMethod = a.nextLine();

            //Create an order ID;
            
            Random rand = new Random();
            int orderID = rand.nextInt(Integer.MAX_VALUE);
            // Create customer and order

             cust[i] = new Customers(name, phone, email, merchCategory, isStudent);
             ord[i] = new Order(orderID, cust[i], merch[i], paymentMethod);

            // Save to array
            System.out.println("\n======= ORDER RECEIPTS =======");
            ord[i].displayOrderSummary();
        }
        a.close();
    }
}
