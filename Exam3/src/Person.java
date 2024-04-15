class Person {
    protected String name;
    protected String Address;
    protected String PhoneNumber;
    protected String EmailAddress;

    public Person(String name, String Address, String PhoneNumber, String EmailAddress) {
        this.name = name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.EmailAddress = EmailAddress;
    }

    public String toString() {
        return "Name: " + name + ", Address: " + Address + ", Phone Number: " + PhoneNumber + ", Email: " + EmailAddress;
    }
}
