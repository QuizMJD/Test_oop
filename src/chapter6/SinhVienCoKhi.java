package chapter6;

public class SinhVienCoKhi extends SinhVien {
    private String Skill;

    public SinhVienCoKhi(String Skill,String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.Skill = Skill;
    }
}
