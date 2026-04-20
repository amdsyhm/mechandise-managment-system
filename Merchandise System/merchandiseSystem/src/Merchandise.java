public abstract class Merchandise{
    protected String merchName; //JPK, MPP, JSP
    protected int amount; //Amount for the Order
                                                        
    public Merchandise(String a, int b){
        merchName = a;
        amount = b;
    }

    public String getMerchName(){
        return merchName;
    }

    public int getAmount(){
        return amount;
    }

    public abstract double calcMerchPrice();

    public void display(){
        System.out.println("Merchandise: "+merchName+"\nAmount: "+amount);
    }
}
