class HourlyEmployee extends Employee{      
    private int hoursWorked;        //inisialisasi class
    private int hourlyPayment;
    
       public int getHoursWorked() {        //membuat methode setter getter
        return hoursWorked;
    }

    public void setHoursWorked(int hw) {
        hoursWorked = hw;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hp) {
        hourlyPayment = hp;
    }
    
    int payment(){
        return getHourlyPayment() * getHoursWorked();   //mengoveride dari class abstrak employe
    }
        
}
