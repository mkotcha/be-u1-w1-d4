import HumanResource.Department;
import HumanResource.Employees;
import HumanResource.WorkLevel;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HandleEmployee {
    public static void main(String[] args) {

        Employees employA = new Employees("Mario rossi", "mario@rossi.it", "5/10/80", "E001", Department.PRODUZIONE);
        Employees employB = new Employees("Franco rossi", "franco@rossi.it", "3/8/77", "E002", Department.PRODUZIONE);
        Employees employC = new Employees("Vittorio Bianchi", "vittorio@bianchi.it", "21/9/94", "E003", 1200, 30, WorkLevel.IMPIEGATO, Department.AMMINISTRAZIONE);
        Employees employD = new Employees("Giuseppe Verdi", "giuseppe@verdi.it", "14/4/34", "E004", 2000, 30, WorkLevel.DIRIGENTE, Department.VENDITE);

        employB.promotion();
        employC.promotion();

        Employees[] employees = {employA, employB, employC, employD};
        double topSalary = 0.0;

        for (Employees employ : employees) {
            System.out.println(employ.toString());
            topSalary += Employees.computeSalary(employ, 5);
        }
        System.out.println(topSalary);
    }
}