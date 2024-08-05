package chapter6;

public class SinhVien {
    protected String Id;
    protected String Name;
    protected double Price;
    protected double tax;

    public SinhVien(String id, String name, double price, double tax) {
        Id = id;
        Name = name;
        Price = price;
        this.tax = tax;
    }

    public double PriceTax(){
        return this.Price*this.tax;

    }
    public void Info(){
        System.out.println("run info from parent");
    }

}
