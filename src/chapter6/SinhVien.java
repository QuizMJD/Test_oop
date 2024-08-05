package chapter6;

public class SinhVien {
    protected String Id;
    protected String Nama;
    protected double Price;
    protected double tax;
    public double PriceTax(){
        return this.Price*this.tax;
    }
    public void Info(){
        System.out.println("run info from parent");
    }

}
