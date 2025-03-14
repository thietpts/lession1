package src.Bai2.javaOOP1;

import com.sun.source.tree.UsesTree;

public class nhanVien {
    public String name;
    public String birth;
    public String  phone;
    public String address;
    public int epx;
    public int band;

    public nhanVien(String name, String birth, String phone, String address, int epx, int band){
        this.name=name;
        this.birth=birth;
        this.phone=phone;
        this.address=address;
        this.epx=epx;
        this.band=band;
    }

    public nhanVien(String name){
        this.name=name;
    }

    public void getInfo() {
        System.out.println("Name: "+this.name);
        System.out.println("Birth: "+this.birth);
        System.out.println("Phone: "+this.phone);
        System.out.println("Address: "+this.address);
        System.out.println("Experience: "+this.epx);
        System.out.println("Band: "+this.band);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEpx(int epx) {
        this.epx = epx;
    }

    public void setBand(int band) {
        this.band = band;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getEpx() {
        return epx;
    }

    public int getBand() {
        return band;
    }
}
