package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress adress) {
        this.name = name;
        this.address = adress;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress adress) {
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
