package oop;
import java.util.Scanner;
public class Customer extends Person{
    private int balance;
    Scanner sn = new Scanner(System.in);
    public Customer(int balance, String name, String address) {
        super(name, address);
        this.balance = balance;
    }

    public Customer() {
        super();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    @Override
    public void nhap(){
       super.nhap();
        System.out.println("Nhap so du cua khach hang: " );
        balance = sn.nextInt();
    }
    @Override
    public void display(){
        System.out.println(super.toString());
        System.out.println("So du cua khach hang: " + balance);
    }
}
