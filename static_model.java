class employee {
    static String company = "Google";
    static int salary;

    public static void display() {
        System.out.println(company);
    }
}

class static_model {
    public static void main(String args[]) {
        employee.salary = 35000;
        employee.display();

        System.out.println(employee.company + ":" + employee.salary);
    }
}
