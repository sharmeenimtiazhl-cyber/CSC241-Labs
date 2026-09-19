// Student.java
// CSC241 - Lab 02 - Task 1 & Task 2
// Sharmeen Imtiaz | SP26-BAI-045

class Student {
    // Instance variables (Task 1)
    String studentId;
    String name;
    int completedCredits;

    // Task 2: Add credits to this student's record
    void addCredits(int credits) {
        completedCredits = completedCredits + credits;
    }

    // Task 2: Compute how many credits remain to reach a degree total
    int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }

    // Task 2: Build a one-line readable summary of this student
    String summary() {
        return "ID: " + studentId + " | Name: " + name + " | Completed Credits: " + completedCredits;
    }
}
