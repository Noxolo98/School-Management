import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            Teacher Smithy = new Teacher(1,"Smithy R", 500);
            Teacher Andrew = new Teacher(2, "Andrew R", 700);
            Teacher Sihle = new Teacher(3, "Sihle R", 500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Smithy);
        teacherList.add(Andrew);
        teacherList.add(Sihle);

            student Amandla = new student(1, "Amandla R", 4);
            student Marcus = new student(2, "Marcus R", 12);
            student Joseph = new student(3,"Joseph R", 8);

            List<student> studentList = new ArrayList<>();
            studentList.add(Amandla);
            studentList.add(Marcus);
            studentList.add(Joseph);


            School chs = new School(teacherList,studentList);

        Amandla.payFees(5000);
        Joseph.payFees(6000);
        System.out.println("CHS has earned R"+chs.getTotalMoneyEarned());

        System.out.println("........MAKING SCHOOL PAY SALARY......");
        Andrew.receiveSalary(Andrew.getSalary());
        System.out.println("CHS has paid salary to "+ Andrew.getName()
        +"and now has R"+ School.getTotalMoneyEarned());
        System.out.println(Marcus);
        System.out.println(Amandla);




        }
    }

