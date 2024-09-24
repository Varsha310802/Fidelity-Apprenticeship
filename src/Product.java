public class Product {
    private int Product_Id;
    private String Product_Name;
    private int Product_Price;
    public static String Product_model="Apple";
    public void Initialize(int id,String name,int price){
        Product_Id=id;
        Product_Name=name;
        Product_Price=price;
    }
    public void Display(){
        System.out.println("Product ID: " + Product_Id);
        System.out.println("Product Name: " + Product_Name);
        System.out.println("Product Price: " + Product_Price);
    }
}

class Electronics extends Product{
    private int Warranty;
    public void Initialize(int id,String name,int price,int warranty){
        super.Initialize(id,name,price);
        Warranty=warranty;
    }
    public void Display() {
        super.Display();
        System.out.println("Warranty: " + Warranty);
    }
}
class Mobile extends Electronics{
    private String Network;
    public void Initialize(int id,String name,int price,int warranty,String network){
        super.Initialize(id,name,price,warranty);
        Network=network;
    }
    public void Display() {
        super.Display();
        System.out.println("Network: " + Network);
    }
}
