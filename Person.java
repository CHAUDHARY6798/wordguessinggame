 class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        // Call superclass constructor directly
        // No need for super() here
        super.(firstName, lastName); 
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    // Override getLastName() method to include job title
    public String getLastName() {
        // Call superclass getLastName() method directly
        // No need for super.getLastName() here
        return lastName + ", " + jobTitle;
    }
}

 class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        Employee employee = new Employee("Jane", "Smith", "E123", "Manager");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + ", ID: " + employee.getEmployeeId());
    }
}
