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

    public static double computeSalary(Emplyees employ) {
        return employ.getSalary();
    }

    public static double computeSalary(Emplyees employ, int overtime) {
        return employ.getSalary() + (employ.getHourSalary() * overtime);
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

    @Override
    public String toString() {
        return "Emplyees{" +
                "id='" + id + '\'' +
                ", baseSalary=" + baseSalary +
                ", salary=" + salary +
                ", hourSalary=" + hourSalary +
                ", level=" + level +
                ", department=" + department +
                '}';
    }

    public WorkLevel promotion() {
        switch (this.level) {
            case OPERAIO -> {
                this.level = WorkLevel.IMPIEGATO;
                this.salary = this.baseSalary * 1.2;
                break;
            }
            case IMPIEGATO -> {
                this.level = WorkLevel.QUADRO;
                this.salary = this.baseSalary * 1.5;
                break;
            }
            case QUADRO -> {
                this.level = WorkLevel.DIRIGENTE;
                this.salary = this.baseSalary * 2;
                break;
            }
            case DIRIGENTE -> {
                System.out.println("errore non si può promuovere un dirigente");
            }
        }
        return this.level;
    }

}
