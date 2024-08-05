package chapter6;

public class SinhVienIt extends SinhVien{
   private String Language;

   public String getLanguage() {
      return Language;
   }

   public void setLanguage(String language) {
      Language = language;
   }

   public SinhVienIt(String Language,String id, String name, double price, double tax ) {
      super(id, name, price, tax);
      this.Language=Language;
   }

   public void getMoney(){
      System.out.println("run get money");
      super.Info();
   };
   public void info(){
      System.out.println("run info from SinhVienIt");
   };

}
