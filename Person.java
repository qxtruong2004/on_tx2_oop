package oop;

import java.util.Scanner;

public  abstract class Person {
    private String name;
    private String address;
    Scanner sn = new Scanner(System.in);
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract void display();

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + '}';
    }


        
    public void nhap(){
        System.out.println("Nhap ten: ");
        name = sn.nextLine();
        try {
        if (name.matches(".*\\d.*")) {
            throw new Exception("Ten khong hop le. Ten khong duoc chua so.");
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new Exception("Ten khong hop le. Ten chi duoc chua chu cai va khoang trang.");
        }
        this.name = name;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        nhap();
    }
        System.out.println("Nhap dia chi: ");
        address = sn.nextLine();
    }
}
