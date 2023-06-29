package school.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    ArrayList <String> a1=new ArrayList<>();
    ArrayList <String> a2=new ArrayList<>();
    ArrayList <String> a3=new ArrayList<>();

    void called(int ch) {
        switch (ch) {
            case 1: {
                System.out.println("enter the teacher");
                Scanner ab = new Scanner(System.in);
                 String teachers = ab.nextLine();
                a1.add(teachers);
                break;
            }
            case 2: {
                System.out.println("all trachers");
                System.out.println(a1);
                break;
            }
            case 3: {
                System.out.println("Remove trachers");
                Scanner ab4 = new Scanner(System.in);
                String r1 = ab4.nextLine();
                a1.remove(r1);
                break;
            }
            case 4: {
                System.out.println("enter the Student");
                Scanner ab1 = new Scanner(System.in);
                String student = ab1.nextLine();
                a2.add(student);
                break;
            }
            case 5: {
                System.out.println("all student");
                System.out.println(a2);
                break;
            }
            case 6: {
                System.out.println("Remove student");
                Scanner ab5 = new Scanner(System.in);
                String r2 = ab5.nextLine();
                a2.remove(r2);
                break;
            }
            case 7: {
                System.out.println("enter the classes");
                Scanner ab3 = new Scanner(System.in);
                String classes = ab3.nextLine();
                a3.add(classes);
                break;
            }
            case 8: {
                System.out.println("all classes");
                System.out.println(a3);
                break;
            }
            case 9: {
                System.out.println("Remove classes");
                Scanner ab6 = new Scanner(System.in);
                String r3 = ab6.nextLine();
                a3.remove(r3);
                break;
            }
            default:
                System.exit(0);

        }
    }

    public static void main(String[] args) {
        School ob=new School();
        Scanner sc=new Scanner(System.in);
        int ch1= sc.nextInt();
        ob.called(ch1);

        }


}
