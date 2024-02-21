 public class PatientDriverApp {
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }
    private static void calculateTotalCharges(Procedure... procedures) {
        double totalCharges = 0.0;
        for (Procedure procedure : procedures) {
            totalCharges += procedure.charges;
        }
        System.out.print("Total changes:" + totalCharges);
    }

   

    public static void main(String[] args) {
        // Sample Data
        Patient patient = new Patient("John", "Doe", "Smith",
                "123 Main St", "Cityville", "CA", "12345", "301-123-4567", "Jane Doe", "202-555-7890");

        Procedure procedure1 = new Procedure("X-Ray", "06/12/2023", "Dr. Anderson", 150.00);
        Procedure procedure2 = new Procedure("Blood Test", "06/15/2023");
        Procedure procedure3 = new Procedure("MRI", "06/18/2023", "Dr. Johnson", 30.50);

        // Display Patient Information
        displayPatient(patient);

        // Display Procedure Information
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);
        calculateTotalCharges(procedure1,procedure2,procedure3);

      }
}
