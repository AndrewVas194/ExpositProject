package entity;


import java.util.Objects;

public class Client {

    private static int count = 0;

    private String name;
    private String number;
    private String mail;
    private String address;

    private int id=0;

    public Client(){
        id=count++;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Client(String name, String number, String mail, String address) {
        this.name = name;
        this.number = number;
        this.mail = mail;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client that = (Client) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}



