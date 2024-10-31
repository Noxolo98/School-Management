import java.util.List;

//implement teacher, students using an ArrayList
// many teachers, many students
public class School {
    private List<Teacher> teachers;
    private List<student>  students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;

    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;

    }

    public void addStudent(student student) {
        students.add(student);
    }

    public List<student> getStudents() {
        return students;

    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeacher() {
        return teachers;

    }

    //new school object is created
    public School(List<Teacher> teachers, List<student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;


    }


}
