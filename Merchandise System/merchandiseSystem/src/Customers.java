public class Customers {
    private String name;
    private String phoneNum;
    private String email;
    private boolean student;
    private String merchType;

    public Customers (String a, String b, String c, String d, boolean e){
        name = a;
        phoneNum = b;
        email = c;
        merchType = d;
        student = e;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public String getEmail(){
        return email;
    }

    public String getMerchType(){
        return merchType;
    }

    public boolean isStudent(){
        return student;
    }

    public void display(){
        System.out.println("Customer Name: "+name+"\nPhone Number: "+phoneNum+"\nEmail: "+email);
    }
}
