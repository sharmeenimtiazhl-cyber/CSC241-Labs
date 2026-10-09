class student {
    String name;

    student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        student s1 = new student("Aisha");
        student s2 = new student("Bilal");

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}