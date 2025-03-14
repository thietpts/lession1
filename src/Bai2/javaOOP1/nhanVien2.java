package src.Bai2.javaOOP1;

public class nhanVien2 extends nhanVien{
    public int salary;
    public nhanVien2(String name, String birth, String phone, String address, int epx, int band) {
        super(name, birth, phone, address, epx, band);
    }
    public nhanVien2(String name){
        super(name);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public nhanVien2(String name, String birth, String phone, String address, int epx, int band, int salary) {
        super(name, birth, phone, address, epx, band);
        this.salary=salary;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(this.salary);
    }

    public static void main(String[] args) {
        nhanVien2 nv2 = new nhanVien2("Lan");
        nhanVien2 nv3 = new nhanVien2("lan","12/12/2000","0988776667", "12 Đỗ Quang", 5,6);
        nv3.getInfo();
        System.out.println(nv2.getName());

        nhanVien2 nv4 = new nhanVien2("lan","12/12/2000","0988776667", "12 Đỗ Quang", 5,6,35000000);
        nv4.getInfo();

    }
}
