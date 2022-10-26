package week_27_Algorithm.Task3_PhoneBookLinkedList;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookImpl implements PhoneBook_LinkedList{

    public PhoneBookNode head;
    public PhoneBookNode tail;
    int size;

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printPhoneBook() {
        PhoneBookNode current = head;
        int element = 1;
        while (current != null) {
            System.out.println(element + ". " + current.contact);
            current = current.next;
            element++;
        }
    }

    @Override
    public void add(Contact contact) {
        PhoneBookNode newNode = new PhoneBookNode(contact);
        if (isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public PhoneBookNode findByFirstName(String firstName) throws Exception {
        if (isEmpty()){
            throw new Exception();
        }
        PhoneBookNode current = head;
        while (current != null){
            if (current.contact.firstName.equals(firstName)){
                return current;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public List<PhoneBookNode> findAllByLastName(String lastName) throws Exception {
        if (isEmpty()){
            throw new Exception();
        }
        List<PhoneBookNode> result = new ArrayList<>();
        PhoneBookNode current = head;
        while (current != null){
            if (current.contact.lastName.equals(lastName)){
                result.add(current);
            }
            current = current.next;
        }

        return result;
    }

    @Override
    public void deleteByFirstName(String firstName) throws Exception {

        if (isEmpty()){
            throw new Exception();
        }
        PhoneBookNode current = head;
        PhoneBookNode prev = head;

        while (current != null){
            if (current.contact.firstName.equals(firstName)){
                if (current == head){
                    if (size == 1){
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    //  P -> C -> N
                    //  P -> N
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }

    }

    @Override
    public void deleteAllMatchingLastName(String lastName) {

    }

    @Override
    public List<PhoneBookNode> findAll() {
        return null;
    }
}