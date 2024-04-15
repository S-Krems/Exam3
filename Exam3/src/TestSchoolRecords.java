import java.util.ArrayList;

class TestSchoolRecords {
    public static void main(String[] args) {
        // Create an ArrayList of Persons
        ArrayList<Person> persons = new ArrayList<>();

        // Add 2 students
        persons.add(new Student("John Doe", "123 Main St", "123-456-7890", "john.doe@example.com", "freshman"));
        persons.add(new Student("Jane Smith", "456 Oak St", "987-654-3210", "jane.smith@example.com", "sophomore"));

        // Add 2 faculty members
        persons.add(new Faculty("Dr. Uncool Person", "789 Elm St", "456-789-0123", "Uncool.Person@gmail.com", "Math", 6000.0, "2023-01-15", "8:00 AM - 12:00 PM", "senior"));
        persons.add(new Faculty("Dr. Cool Person", "321 Pine St", "789-012-3456", "Cool.Person@gmail.com", "Physics", 6500.0, "2022-11-20", "10:00 AM - 2:00 PM", "junior"));

        // Add 2 staff members
        persons.add(new Staff("Tom Cruise", "987 Cedar St", "234-567-8901", "Tom.Cruisen@gmail.com", "Administrative Assistant"));
        persons.add(new Staff("John Johnson", "654 Birch St", "890-123-4567", "John.Johnson@gmail.com", "Custodian"));

        // Traverse the list and print details of each person
        for (Person person : persons) {
            System.out.println(person);
        }

        // Filter persons who are employees
        ArrayList<Person> employees = getEmployees(persons);

        // Print details of employees
        System.out.println("\nEmployees:");
        for (Person employee : employees) {
            System.out.println(employee);
        }
    }

    // Function to filter employees from the list of persons
    public static ArrayList<Person> getEmployees(ArrayList<Person> persons) {
        ArrayList<Person> employees = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee) {
                employees.add(person);
            }
        }
        return employees;
    }
}