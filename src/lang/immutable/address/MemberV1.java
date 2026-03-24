package lang.immutable.address;

public class MemberV1 {

    private String name;
    private Address address;

    public MemberV1(String name, Address adress) {
        this.name = name;
        this.address = adress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", adress=" + address +
                '}';
    }

}
