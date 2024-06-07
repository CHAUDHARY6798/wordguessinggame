
 public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    // Constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    // Method to calculate bonus (dummy implementation)
    public double calculateBonus() {
        // Dummy implementation, actual calculation can vary based on company policy
        return salary * 0.1; // Assuming 10% of salary as bonus
    }

    // Method to generate performance report (dummy implementation)
    public void generatePerformanceReport() {
        // Dummy implementation, actual report generation can involve more complex logic
        System.out.println("Performance report for " + name + " generated.");
    }

    // Method to manage projects (dummy implementation)
    public void manageProjects() {
        // Dummy implementation, actual project management can involve more complex tasks
        System.out.println(name + " is managing projects.");
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, String address, double salary, String jobTitle, int teamSize) {
        super(name, address, salary, jobTitle);
        this.teamSize = teamSize;
    }

    // Getter for teamSize
    public int getTeamSize() {
        return teamSize;
    }

    // Overriding method to calculate bonus
    @Override
    public double calculateBonus() {
        // Managers might have different bonus calculation logic
        return salary * 0.15; // Assuming 15% of salary as bonus for managers
    }

    // Overriding method to generate performance report
    @Override
    public void generatePerformanceReport() {
        // Managers might have specific report generation requirements
        System.out.println("Performance report for manager " + name + " generated.");
    }

    // Overriding method to manage projects
    @Override
    public void manageProjects() {
        // Managers might have different project management responsibilities
        System.out.println(name + " is managing team projects.");
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Overriding method to calculate bonus
    @Override
    public double calculateBonus() {
        // Developers might have different bonus calculation logic
        return salary * 0.12; // Assuming 12% of salary as bonus for developers
    }

    // Overriding method to generate performance report
    @Override
    public void generatePerformanceReport() {
        // Developers might have specific report generation requirements
        System.out.println("Performance report for developer " + name + " generated.");
    }

    // Overriding method to manage projects
    @Override
    public void manageProjects() {
        // Developers might have different project management responsibilities
        System.out.println(name + " is working on development projects.");
    }
}

// Subclass Programmer
class Programmer extends Developer {
    private String specialization;

    // Constructor
    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String specialization) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.specialization = specialization;
    }

    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }

    // Method specific to programmers
    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of different employee types
        Manager manager = new Manager("John Doe", "123 Main St", 80000, "Manager", 10);
        Developer developer = new Developer("Jane Smith", "456 Oak St", 60000, "Developer", "Java");
        Programmer programmer = new Programmer("Alice Johnson", "789 Pine St", 70000, "Programmer", "Python", "Data Science");

        // Displaying employee information and performing tasks
        displayEmployeeInfo(manager);
        manager.generatePerformanceReport();
        manager.manageProjects();
        System.out.println("Bonus for " + manager.getName() + ": $" + manager.calculateBonus());

        displayEmployeeInfo(developer);
        developer.generatePerformanceReport();
        developer.manageProjects();
        System.out.println("Bonus for " + developer.getName() + ": $" + developer.calculateBonus());

        displayEmployeeInfo(programmer);
        programmer.generatePerformanceReport();
        programmer.manageProjects();
        programmer.writeCode();
        System.out.println("Bonus for " + programmer.getName() + ": $" + programmer.calculateBonus());
    }

    // Method to display employee information
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Job Title: " + employee.getJobTitle());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Team Size: " + manager.getTeamSize());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        } else if (employee instanceof Programmer) {
            Programmer programmer = (Programmer) employee;
            System.out.println("Programming Language: " + programmer.getProgrammingLanguage());
            System.out.println("Specialization: " + programmer.getSpecialization());
        }

        System.out.println();
    }
}
