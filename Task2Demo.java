// Task2Demo.java
// CSC241 - Lab 02 - Task 2: Add Behavior - Parameters, Local Variables, Return Values
// Sharmeen Imtiaz | SP26-BAI-045

class Task2Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = "SP26-BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "SP26-BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        // Call addCredits on both objects
        s1.addCredits(6);
        s2.addCredits(9);

        // Call remainingCredits on both objects (degree requires 130 credits)
        int remaining1 = s1.remainingCredits(130);
        int remaining2 = s2.remainingCredits(130);

        System.out.println(s1.name + " remaining credits: " + remaining1);
        System.out.println(s2.name + " remaining credits: " + remaining2);

        // Call summary on both objects
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        // credits (in addCredits) is a PARAMETER - a value passed in when the method is called.
        // completedCredits is a FIELD - it belongs to the object and persists across calls.
        // remaining (in remainingCredits) is a LOCAL VARIABLE - it exists only inside that method call.
    }
}
