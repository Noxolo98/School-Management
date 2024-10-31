
//this class is responsible for keeping track of teacher's id,name & salary
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

   //creates a new teacher object
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=salaryEarned;

    }
    //return the id of the teacher.
    public int getId(){
        return id;
    }
    //return the name of the teacher.
    public String getName(){
        return name;

    }
    //return the salary of the teacher.
    public int getSalary(){
        return salary;
    }
    //set the salary of the teacher
    public void getSalary(int salary){
        this.salary=salary;
    }


    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);


    }
    @Override
    public String toString() {
        return name+ salaryEarned;
    }

}
