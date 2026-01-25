class teacher {
    final String name = "Shadow";
    int subject1;
    int subject2;

    public final void marks() {
        subject1 = 85;
        subject2 = 88;
    }

    public void data() {
        subject1 = 75;
        subject2 = 78;
    }
}

class teacher_marks {
    public static void main(String args[]) {
        teacher t1 = new teacher();
        t1.marks();
        t1.data();

        System.out.println(t1.name);
        System.out.println(t1.subject1);
        System.out.println(t1.subject2);
    }
}
