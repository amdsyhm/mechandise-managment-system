public class MerchMPP extends Merchandise {
    private String merchandiseType; // (Jersey, Corporate Clothes, Tote)

    public MerchMPP(String a, int b, String c){
        super(a, b);
        merchandiseType = c;
    }

    public String getMerchandiseType(){
        return merchandiseType;
    }

     public double calcMerchPrice(){
        double unitPrice = 0;
        if (merchandiseType.equalsIgnoreCase("Jersey")) unitPrice = 55;
        else if (merchandiseType.equalsIgnoreCase("Lanyard")) unitPrice = 15;
        else if (merchandiseType.equalsIgnoreCase("Corporate Clothes")) unitPrice = 80;
        else if (merchandiseType.equalsIgnoreCase("Tote Bag")) unitPrice = 10;
        
        return unitPrice;
    }

    public void display(){
        super.display();
        System.out.println("Merch Type: "+merchandiseType+"\nItem Price: RM"+calcMerchPrice());
    }
}
