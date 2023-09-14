package Polymorphism;

public class MainCompany {
    public static void main(String[] args){
//        permanent employee
//        Employee em1 = new Employee("Jake", 2312);
//        em1.displayEmployeeInfo();
//        Employee em2 = new Employee("Josh", 344, 35,40);
//        em2.displayEmployeeInfo();
//        Employee m1 = new Manager("Kim", 233,1500);
//        m1.welcomeMessage();
//
//        Manager m2 =  (Manager) m1;
//        m2.welcomeMessage();
//        m2.managersDeskInfo();
        Manager Dasun = new Manager("Dasun",33,2000);
        Dasun.welcomeMessage();
//        Upcasting
        Employee Kim = new Manager("Kim", 233,1500);
        Kim.welcomeMessage();



    }
}
