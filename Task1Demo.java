// Task1Demo.java
// CSC241 - Lab 02 - Task 1: Build a Class and Prove Independent Object State
// Sharmeen Imtiaz | SP26-BAI-045

class Task1Demo {
    public static void main(String[] args) {

        // Create three Student objects from one Student class
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Assign values (BAI example data)
        s1.studentId = "SP26-BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        s2.studentId = "SP26-BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        s3.studentId = "SP26-BAI-003";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 60;

        // Print all three objects before any change
        System.out.println("Before change:");
        System.out.println(s1.studentId + " | " + s1.name + " | " + s1.completedCredits);
        System.out.println(s2.studentId + " | " + s2.name + " | " + s2.completedCredits);
        System.out.println(s3.studentId + " | " + s3.name + " | " + s3.completedCredits);

        // Increase completedCredits of only one object (s2)
        s2.completedCredits = s2.completedCredits + 3;

        // Print all three objects again
        System.out.println("\nAfter change (only s2 modified):");
        System.out.println(s1.studentId + " | " + s1.name + " | " + s1.completedCredits);
        System.out.println(s2.studentId + " | " + s2.name + " | " + s2.completedCredits);
        System.out.println(s3.studentId + " | " + s3.name + " | " + s3.completedCredits);

        // Explanation:
        // s1 and s3 are separate objects in separate memory locations, each with
        // its own copy of completedCredits, so changing s2's field cannot affect them.
    }
}
