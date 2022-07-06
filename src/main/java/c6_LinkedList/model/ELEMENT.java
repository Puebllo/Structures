package c6_LinkedList.model;

public class ELEMENT {

    int value;
    ELEMENT nextElement;

    public ELEMENT(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ELEMENT getNextElement() {
        return nextElement;
    }

    public void setNextElement(ELEMENT nextElement) {
        this.nextElement = nextElement;
    }
}
