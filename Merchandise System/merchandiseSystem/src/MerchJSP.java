public class MerchJSP extends Merchandise{
    private String merchandiseType; // (Jersey, Jacket)

    public MerchJSP (String a, int b, String c){
        super(a, b);
        merchandiseType = c;
    }

    public String getMerchandiseType(){
        return merchandiseType;
    }

     public double calcMerchPrice() {
        double unitPrice = 0;
        if (merchandiseType.equalsIgnoreCase("Jersey")) unitPrice = 45;
        else if (merchandiseType.equalsIgnoreCase("Jacket")) unitPrice = 75;

        return unitPrice;
    }

    public void display(){
        super.display();
        System.out.println("Merch Type: "+merchandiseType+"\nItem Price: RM"+calcMerchPrice());
    }
}   
