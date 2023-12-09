package oop;
import java.util.Scanner;
public class Employee extends Person {
   private int salary;
   Scanner sn = new Scanner (System.in);
    public Employee(int salary, String name, String address) {
        super(name, address);
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    public Employee(String name, String address) {
        super(name, address);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
   @Override
   public void nhap(){
       super.nhap();
       System.out.println("Nhap luong cua nhan vien: ");
       salary = sn.nextInt();
   }
   @Override
   public void display(){
       System.out.println(super.toString() );
       System.out.println("Luong cua nhan vien do la: " + salary);
       
   }

}
