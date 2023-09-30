class student
{
    String studname, branch;
    double semester, rollno;
    student(String studname, String branch, int rollno, int semester)
    {
        this.rollno=rollno;
        this.studname=studname;
        this.branch=branch;
        this.semester=semester;
    }

    void display()
    {
        System.out.println("student name: "+studname);
        System.out.println("branch: "+branch);
        System.out.println("roll no: "+rollno);
        System.out.println("Semester: "+semester);
    }
}

public class stud
{
    public static void main(String arg[])
    {
        student s1 = new student("shounak", "computer", 54, 5);
        System.out.println("Student Details: ");
        s1.display();
    }
}