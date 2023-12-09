package oop;
import java.util.ArrayList;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
    ArrayList <Employee> e1 = new ArrayList<>();
    ArrayList <Customer> c1 = new ArrayList<>();
    int result;
    do{
            System.out.println("MENU");
            System.out.println("1. ADD Employee");
            System.out.println("2. ADD Customer");
            System.out.println("3. DISPLAY Information");
            System.out.println("4. Dua ra employee co luong cao nhat, Customer co so du thap nhat");
            System.out.println("5. Tim kiem EMPLOYEE theo NAME");
            int choice;
            System.out.println("Moi ban nhap su lua chon: ");
            choice = sn.nextInt();
            sn.nextLine();
            switch(choice){
                case 1:
                    System.out.println("ADD EMPLOYEE");
                    Employee e = new Employee();
                    e.nhap();
                    e1.add(e);
                   
                    break;
                case 2:
                    System.out.println("ADD Customer");
                    Customer c = new Customer();
                    c.nhap();
                    c1.add(c);
                    
                    break;    
                case 3:
                    System.out.println("DISPLAY");
                    for (Employee e3 : e1) {
                        e3.display();
                        System.out.println("====");
                    }
                    System.out.println("*********");
                    for(Customer c3 : c1){
                        c3.display();
                        System.out.println("====");
                    }
                    break;
                case 4:
                    System.out.println("SKILL");
                    int max = 0;
                    for(Employee e3 : e1){
                        if(e3.getSalary() > max){
                            max = e3.getSalary();
                        }
                    }
                    int min = 10000;
                    for(Customer c3 : c1){
                        if(c3.getBalance() < min){
                            min = c3.getBalance();
                        }
                    }
                    System.out.println("EMPLOY CO LUONG CAO NHAT LA: ");
                    for(Employee e3 : e1){
                        if(e3.getSalary() == max){
                            e3.display();
                        }
                    }
                    System.out.println("CUSTOMER CO SO DU THAP NHAT LA: ");
                    for(Customer c3 : c1){  
                        if(c3.getBalance() == min){
                            c3.display();
                        }
                    }
                    break;
                case 5: 
                    System.out.println("FIND");
                    String ten;
                    System.out.println("Nhap ten ban muon tim kiem: ");
                    ten = sn.nextLine();
                    int d = 0;
                    for(Employee e3 : e1){
                        
                        if(ten.equals(e3.getName())){
                            System.out.println("Da tim thay sinh vien co ten nhu vay");
                            d++;
                            e3.display();
                        }
                    }
                    if(d == 0) System.out.println("Khong tim thay sinh vien");
                    break;
                default: System.out.println("NOOOOOO");    
            }
            System.out.println("Nhap 0 neu ban muon dung lai: ");
                result = sn.nextInt();
      }
    while(result != 0);
   }
}
