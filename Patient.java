
public class Patient {

	private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emContactName;
    private String emPhoneNumber;

    // Constructors
    public Patient() {}

    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city,
                   String state, String zipCode, String phoneNumber, String emContactName, String emPhoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emContactName = emContactName;
        this.emPhoneNumber = emPhoneNumber;
    }

    // Getters and Setters

    // Methods
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emContactName + " " + emPhoneNumber;
    }

    @Override
    public String toString() {
        return "Patient Information:\n" +
                "\tFull Name: " + buildFullName() + "\n" +
                "\tAddress: " + buildAddress() + "\n" +
                "\tPhone Number: " + phoneNumber + "\n" +
                "\tEmergency Contact: " + buildEmergencyContact();
    }

}
