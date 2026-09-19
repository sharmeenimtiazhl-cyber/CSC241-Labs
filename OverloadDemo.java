// OverloadDemo.java
// CSC241 - Lab 02 - Task 3: Method Signatures and Overloading
// Sharmeen Imtiaz | SP26-BAI-045

class OverloadDemo {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course: " + courseCode);
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course: " + courseCode + ", Section: " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course code: " + numericCourseCode);
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        // Predict before compiling:
        demo.enroll("CSC241");        // calls enroll(String)
        demo.enroll("CSC241", 2);     // calls enroll(String, int)
        demo.enroll(241);             // calls enroll(int)

        // Invalid calls (kept commented out - would not compile):
        // demo.enroll();                 // ERROR: no matching method - enroll() does not exist
        // demo.enroll("241", "2");       // ERROR: no enroll(String, String) overload exists

        // Invalid overload attempt (differs only by return type) - observed compiler error:
        // int enroll(String courseCode) { return 0; }
        // Compiler error (captured in compiler_notes.txt):
        // "error: method enroll(String) is already defined in class OverloadDemo"
        // Return type is not part of a method's signature, so this is a duplicate method,
        // not a valid overload - the compiler cannot tell them apart.
    }
}
