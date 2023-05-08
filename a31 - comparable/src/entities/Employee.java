package entities;

public class Employee implements Comparable<Employee> {
    
    private String name;
    private Double salary;

    public Employee (String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary (Double salary) {
        this.salary = salary;
    }

    @Override
    // compara um elemento com outro, se for anterior (numericamente ou de ordem alfabetica), retornara -12, se for igual, 0, se for maior 12
    public int compareTo(Employee other) { 
        return name.compareTo(other.getName());
    }

}
