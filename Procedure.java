 public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitioner;
    double charges;

    // Constructors
    public Procedure() {}

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitioner, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Procedure Information:\n" +
                "\tName: " + procedureName + "\n" +
                "\tDate: " + procedureDate + "\n" +
                "\tPractitioner: " + practitioner + "\n" +
                "\tCharges: $" + String.format("%.2f", charges);
    }
}
