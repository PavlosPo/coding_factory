package gr.aueb.cf.ch11;

public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private String vatRegNo;
    private String phone;
    private String address;

    public Customer() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setVatRegNo(String vatRegNo) {
        this.vatRegNo = vatRegNo;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getVatRegNo() {
        return vatRegNo;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Customer(int id, String firstname, String lastname, String vatRegNo, String phone, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.vatRegNo = vatRegNo;
        this.phone = phone;
        this.address = address;
    }
}
