package rikkei.academy;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    //static method to change the value of static variable
    public static void change() {
        college = "RIKKEI ACADEMY";
    }
    public void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
