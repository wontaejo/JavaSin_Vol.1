package c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculate = new CalculateSalary();
        calculate.calculateSalaries();
        Employee emp = new Employee("LeeDaeRi", 1, 1000000000);
        System.out.println(calculate.getSalaryIncrease(emp));
    }
    
    public long getSalaryIncrease(Employee employee) {
        double salary = 0;
        long salaryLong = 0;
        switch(employee.getType()) {
            case 1:
                salary = employee.getSalary() - (employee.getSalary() * 0.95); 
                salaryLong = (long)salary;
            break;
            case 2:
                salary = employee.getSalary() + (employee.getSalary() * 10 / 100);
                salaryLong = (long)salary;
            break;
            case 3:
                salary = employee.getSalary() + (employee.getSalary() * 20 / 100);
                salaryLong = (long)salary;
            break;
            case 4:
                salary = employee.getSalary() + (employee.getSalary() * 30 / 100);
                salaryLong = (long)salary;
            break;
            case 5:
                salary = employee.getSalary() + (employee.getSalary() * 100 / 100);
                salaryLong = (long)salary;
            break;
        }
        return salaryLong;
    }
    
    public void calculateSalaries() {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("LeeDaeRi", 1, 1000000000);
        employee[1] = new Employee("Kmmanager", 2, 100000000);
        employee[2] = new Employee("WhangDesign", 3, 70000000);
        employee[3] = new Employee("ParkArchi", 4, 80000000);
        employee[4] = new Employee("LeeDevelop", 5, 60000000);
       
        for(int i=0; i<employee.length; i++) {
            System.out.println(employee[i].getName() + "=" + getSalaryIncrease(employee[i]));
        }
    }
}
