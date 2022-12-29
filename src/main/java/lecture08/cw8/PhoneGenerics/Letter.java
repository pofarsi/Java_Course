package lecture08.cw8.PhoneGenerics;

public class Letter {

    private final String sender;

    public Letter(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Generics4Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }
}
