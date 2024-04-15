class Staff extends Employee {
      String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String title) {
        super(name, address, phoneNumber, emailAddress, "", 0.0, "");
        this.title = title;
    }
}
