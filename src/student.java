
//this class is responsible for keeping track of student  id, fees,name,grade & fees paid
public class student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    //To create a new student object
    public student (int id, String name, int grade) {
        this.feesPaid=0;
        this.totalFees=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;


    }
    // the student name,student id are not going to be altered

    // used to update student's grade
    public void setGrade(int grade){
        this.grade=grade;

    }
    {

    }
//return the id of student
    public int getId() {
        return id;
    }
// return the name of student
    public String getName() {
        return name;
    }
    // return the grade of student

    public int getGrade() {
        return grade;
    }
// return fees paid by the student
    public int getFeesPaid() {
        return feesPaid;
    }
// return the total fees of the student
    public int getTotalFees() {
        return totalFees;
    }
    public int getRemainingFees(){
        return totalFees-feesPaid;
    }

    //keep adding fees to the feesPaid field
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    @Override
    public String toString() {
        return name + feesPaid;
    }
}
