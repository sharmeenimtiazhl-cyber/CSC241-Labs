// PassByValueDemo.java
// CSC241 - Lab 02 - Task 4: Prove Java Pass-by-Value
// Sharmeen Imtiaz | SP26-BAI-045

class PassByValueDemo {

    // Experiment A: primitive int
    void changeNumber(int x) {
        x = 99;
    }

    // Experiment B: mutate the object through a copied reference
    void changeStudent(Student st) {
        st.completedCredits = 99;
    }

    // Experiment C: reassign the parameter to a new object
    void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
    }

    public static void main(String[] args) {
        PassByValueDemo demo = new PassByValueDemo();

        // ---------- Experiment A ----------
        int number = 10;
        System.out.println("Experiment A - Before: " + number);
        demo.changeNumber(number);
        System.out.println("Experiment A - After: " + number);
        // The argument value is copied into the parameter, so changing x
        // inside changeNumber does not affect the caller's original int variable.

        // ---------- Experiment B ----------
        Student st1 = new Student();
        st1.name = "Abeer Amina";
        st1.completedCredits = 30;
        System.out.println("\nExperiment B - Before: " + st1.completedCredits);
        demo.changeStudent(st1);
        System.out.println("Experiment B - Inside Method: completedCredits set to 99");
        System.out.println("Experiment B - After: " + st1.completedCredits);
        // The argument value is copied into the parameter, but that copied value is a
        // reference pointing to the same object, so mutating a field through it is visible to the caller.

        // ---------- Experiment C ----------
        Student st2 = new Student();
        st2.name = "Ali Ishtiaq";
        System.out.println("\nExperiment C - Before: " + st2.name);
        demo.replaceStudent(st2);
        System.out.println("Experiment C - Inside Method: local st reassigned to a new Student named Temporary");
        System.out.println("Experiment C - After: " + st2.name);
        // The argument value is copied into the parameter, so reassigning the local
        // parameter st only redirects that copy - it cannot redirect the caller's original variable.
    }
}
