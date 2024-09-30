 class UserDefinedException extends Exception {
    public UserDefinedException(String message) {
        super(message);
    }
}
class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
