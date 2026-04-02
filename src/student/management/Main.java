package student.management;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StudentManager listStudent = new StudentManager();
        System.out.println("Select function: ");
        System.out.print("1 for add student\n" +
                "2 for remove student by ID\n" +
                "3 for get the number of students\n" +
                "4 for find student by ID\n" +
                "5 for find student by name\n" +
                "6 for sort student list by cpa\n" +
                "7 for sort student list by name\n" +
                "8 for check list is empty\n" +
                "9 for delete list\n" +
                "10 for print list\n" +
                "0 for out of programme\n");
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            number = sc.nextInt();
            sc.nextLine();

            if(number==1){
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                System.out.print("Enter full name: ");
                String name = sc.nextLine();
                System.out.print("Enter birth date (year month day): ");
                int day = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt();
                sc.nextLine();
                LocalDate birthDate = LocalDate.of(day, month,year);
                System.out.print("Enter CPA: ");
                double cpa = sc.nextDouble();
                sc.nextLine();
                Student s = new Student(id, name, birthDate, cpa);
                listStudent.addStudent(s);
            }
            else if(number==2){
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                listStudent.removeStudentById(id);
            }
            else if(number==3){
                int count = listStudent.getStudentCount();
                System.out.println("The number of students: " + count);
            }
            else if(number==4){
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                listStudent.findStudentById(id);
            }
            else if(number==5){
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                listStudent.findStudentByName(name);
            }
            else if(number==6){
                listStudent.sortStudentByCpa();
            }
            else if(number==7){
                listStudent.sortStudentByName();
            }
            else if(number==8){
                System.out.println(listStudent.isListEmpty());
            }
            else if(number==9){
                listStudent.clearList();
            }
            else if(number==10) {
                listStudent.printList();
            }
            else if(number==0) break;
        }
    }
}
