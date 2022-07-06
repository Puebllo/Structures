package c6_DoublyLinkedList.model;

import c6_LinkedList.model.ELEMENT;

public class DoublyLinkedList {

    private DoublyElement head;
    private DoublyElement tail;

    private int counter;

    public DoublyElement getHead() {
        return head;
    }

    public void setHead(DoublyElement head) {
        this.head = head;
    }

    public DoublyElement getTail() {
        return tail;
    }

    public void setTail(DoublyElement tail) {
        this.tail = tail;
    }

    public DoublyElement add(MockDTO mdto){
        DoublyElement doublyElement = new DoublyElement(mdto);
        if (getHead() == null && getTail() == null){
            setHead(doublyElement);
            setTail(doublyElement);
        }else{
            DoublyElement tail = getTail();
            tail.setNext(doublyElement);
            doublyElement.setPrevious(tail);
            setTail(doublyElement);
        }

        incrementCounter();
        System.out.println("Dodano + " + doublyElement.toString());
        return doublyElement;
    }


    public void printElements(){
        DoublyElement ele = this.getHead();
        System.out.print("[");
        while (ele!=null){
            System.out.print(ele.getRecord().toString() + ",");
            ele = ele.getNext();
        }
        System.out.print("]");
    }

    public void printElementsBackwards(){
        DoublyElement ele = this.getTail();
        System.out.print("[");
        while (ele!=null){
            System.out.print(ele.getRecord().toString() + ",");
            ele = ele.getPrevious();
        }
        System.out.print("]");
    }
    private void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public int count() {
        return counter;
    }

    public boolean removeByName(String search) {
        if (count() >0) {
            if (getHead().getRecord().getLogin().equals(search)) {
                DoublyElement de = getHead();
                de.getNext().setPrevious(null);
                setHead(de.getNext());
                decrementCounter();
                return true;
            }
            if (getTail().getRecord().getLogin().equals(search)) {
                DoublyElement de = getTail();
                de.getPrevious().setNext(null);
                setTail(de.getPrevious());
                decrementCounter();
                return true;
            }

            DoublyElement ele = getHead();
            while (ele != null) {
                if (ele.getRecord().getLogin().equals(search)){
                    ele.getPrevious().setNext(ele.getNext());
                    ele.getNext().setPrevious(ele.getPrevious());

                    decrementCounter();
                    return true;
                }else{
                    ele = ele.getNext();
                }
            }
        }


        return false;
    }
}
