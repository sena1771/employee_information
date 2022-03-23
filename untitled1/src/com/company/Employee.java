package com.company;

public class Employee {
    String name;
    double salary;
    int WorkHours;
    int hireYear; //start date to the job
    int currentYear=2021;

    Employee(String name,double salary,int workHours,int hireYear){
            this.name=name;
            this.salary=salary;
            this.WorkHours=workHours;
            this.hireYear=hireYear;
    }
            double tax(){
               if(this.salary<1000){
                    return 0;
                  }
                else
                 return  this.salary*0.03;
    }
     double bonus(){
        if(this.WorkHours>40){
           return (this.WorkHours-40)*30; }
           else
               return 0;
    }
    double raiseSalary() {
     if(currentYear-hireYear<10) {
         return this.salary*0.05; }
         else if(currentYear-hireYear>9 && currentYear-hireYear<20){
             return this.salary*0.1;
     }
         else
             return this.salary*0.15;
     }
     double total() {
        return this.salary-this.tax()+this.bonus()+this.raiseSalary();
     }


@Override
    public String toString() {
    return " Name: " +this.name+
            "\n Salary:  "+this.salary+
            "\n Work Hours: "+this.WorkHours+
            "\n Hire Year: "+this.hireYear+
            "\n Tax: "+this.tax() +
            "\n Bonus : "+this.bonus() +
            "\n Total Salary: "+total();


     }

    }




