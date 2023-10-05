public class Emplyees {

    private final String id;
    public double baseSalary;
    private double salary;
    private double hourSalary;
    private WorkLevel level;
    private Department department;

    public Emplyees(String id, Department department) {
        this.id = id;
        this.department = department;
        this.salary = this.baseSalary;
        this.hourSalary = 30;
        this.level = WorkLevel.OPERAIO;
    }

    public Emplyees(double baseSalary, String id, double salary, double hourSalary, WorkLevel level, Department department) {
        this.baseSalary = baseSalary;
        this.id = id;
        this.salary = salary;
        this.hourSalary = hourSalary;
        this.level = level;
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public WorkLevel getLevel() {
        return level;
    }
}
