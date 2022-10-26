package week_27_Algorithm.Task3_PhoneBookLinkedList;

public class PhoneBookNode {

    public PhoneBookNode next;

    public Contact contact;

    public PhoneBookNode(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "PhoneBookNode{" +
                "contact=" + contact +
                '}';
    }
}