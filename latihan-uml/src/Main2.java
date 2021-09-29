public class Main2 {
    public static void main(String[] args) {
        Employee[] e = new Employee[2];
        SalariedEmployee se = new SalariedEmployee();
        HourlyEmployee he = new HourlyEmployee();

        e[0] = se;
        e[1] = he;
        
        se.setSalary(1000);

        he.setHourlyPayment(15);
        he.setHoursWorked(25);

        for (Employee i : e){
            System.out.println(i.payment());
        }
    }
}