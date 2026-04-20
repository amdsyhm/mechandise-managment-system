public class MerchJPK extends Merchandise{
    private String merchandiseType; // (Jersey, Tie, Hoodie)

    public MerchJPK (String a, int b, String c){
        super(a, b);
        merchandiseType = c;
    }

    public String getMerchandiseType(){
        return merchandiseType;
    }

     public double calcMerchPrice(){
        double unitPrice = 0;
        if (merchandiseType.equalsIgnoreCase("Jersey")) unitPrice = 55;
        else if (merchandiseType.equalsIgnoreCase("Hoodie")) unitPrice = 70;
        else if (merchandiseType.equalsIgnoreCase("NeckTie")) unitPrice = 20;

        return unitPrice;
    }

    public void display(){
        super.display();
        System.out.println("Merch Type: "+merchandiseType+"\nItem Price: RM"+calcMerchPrice());
    }
}
