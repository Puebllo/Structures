package c6_DoublyLinkedList.model;

public class DoublyElement {

    private MockDTO record;
    private DoublyElement previous;
    private DoublyElement next;

    public DoublyElement() {
    }

    public DoublyElement(MockDTO mdto) {
        this.record = mdto;
    }

    public DoublyElement getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyElement previous) {
        this.previous = previous;
    }

    public DoublyElement getNext() {
        return next;
    }

    public void setNext(DoublyElement next) {
        this.next = next;
    }

    public MockDTO getRecord() {
        return record;
    }

    public void setRecord(MockDTO record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "["+ getRecord().toString() + "]";
    }
}
