public class ContactInfo {
    protected String email;
    protected String nidNumber;
    protected String name;
    protected String address;
    protected String phone;

    public ContactInfo(String email, String nidNumber, String name, String address, String phone) {
        this.email = email;
        this.nidNumber = nidNumber;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(String nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}