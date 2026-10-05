package student;

public class Student {
    String studying = "Im study";
    private String name;

    void study() {
        System.out.println(studying);
    }
}

class JavaStudent extends
Student {
    @Override
           void study() {
        System.out.println("Я очень занят. Прохожу курс по Java.");
    }

    public static void main(String[] args) {
     JavaStudent u1 = new JavaStudent();
     u1.study();
     Student u2 = new Student();
     u2.study();
    }
}

