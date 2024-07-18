//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void UC1() {
            int IS_FULL_TIME = 1;
            double empCheck = Math.floor(Math.random() * 10) % 2;
            if (empCheck == IS_FULL_TIME){
                System.out.println("Employee is Present");
            }
            else{
                System.out.println("Employee is Absent");
            }

    }
    public static void UC2(){
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        int empHours = 0;
        int empWage  = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME){
            empHours = 8;
        }
        else {
            empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("EmpWage: " + empWage);
    }
    public static void UC3() {

        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;

        int empHours = 0;
        int empWage  = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PART_TIME){
            empHours = 4;

        } else if (empCheck == IS_FULL_TIME) {
            empHours = 8;
        } else {
            empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("EmpWage: " + empWage);
    }

    public static void main(String[] args) {
        UC1();
        UC2();
        UC3();
    }

}