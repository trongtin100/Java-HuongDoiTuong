public class staticStudent {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public staticStudent (int r, String n) {
        rollno = r;
        name = n;
    }
    void display () {
        System.out.println(rollno + "" + name + "" + college );
    }
}
