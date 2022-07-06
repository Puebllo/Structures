package c6_LinkedList.model;

public class LinkedList {

    ELEMENT tail;
    ELEMENT head;

    public LinkedList() {
        this.setHead(null);
        this.setTail(null);
    }

    public ELEMENT getTail() {
        return tail;
    }

    public void setTail(ELEMENT tail) {
        this.tail = tail;
    }

    public ELEMENT getHead() {
        return head;
    }

    public void setHead(ELEMENT head) {
        this.head = head;
    }

    public void printElements(){
        ELEMENT ele = this.getHead();
        System.out.print("[");
        while (ele!=null){
            System.out.print(ele.getValue() + ",");
            ele = ele.getNextElement();
        }
        System.out.print("]");
    }

    public void addNewElement(int value){
        ELEMENT newElement = new ELEMENT(value);
        //empty list
        if (isListEmpty()){
            setHead(newElement);
            setTail(newElement);
        }else {//next element
            ELEMENT element1 = this.getTail();
            element1.setNextElement(newElement);
            this.setTail(newElement);
        }
    }

    public void addSortedElementASC(int value){
        ELEMENT newElement = new ELEMENT(value);
        //empty list
        if (isListEmpty()){
            setHead(newElement);
            setTail(newElement);
        }else {//next element

            //check head
            if (this.getHead().getValue()> value){
                ELEMENT tmp = this.getHead();
                newElement.setNextElement(tmp);
                this.setHead(newElement);
                return;
            }


            //store prev element
            ELEMENT prev = this.getHead();
            ELEMENT curr = prev.getNextElement();
            if (curr==null){
                prev.setNextElement(newElement);
            }else {
                if (!curr.equals(prev)) {
                    while (curr != null) {

                        if (
                                (prev.getValue() < value && curr.getValue() > value)
                            //   ||  (prev.getValue() > value && curr.getValue() < value)
                        ) {
                            prev.setNextElement(newElement);
                            newElement.setNextElement(curr);
                            break;
                        }
                        prev = curr;
                        curr = curr.getNextElement();
                    }

                } else {
                    curr.setNextElement(newElement);
                    this.setTail(newElement);
                }
            }
            //check if new element is between prev and current element

        }
    }

    private boolean isListEmpty() {
        if (getHead()==null && getTail()==null){
            return true;
        }
        return false;
    }

    public ELEMENT getElementByValue(int value){
        //if there's 1 element in list
        if (this.getHead().equals(this.getTail())){
            if (this.getHead().getValue() == value) {
                return this.getHead();
            }else{
                return null;
            }
        }

        //check head
        if (this.getHead().getValue() == value){
            return this.getHead();
        }
        //check tail
        if (this.getTail().getValue() == value){
            return this.getTail();
        }

        ELEMENT ele = this.getHead().getNextElement();
        while (ele.getValue() != value){
            if (ele.getNextElement()!=null) {
                ele = ele.getNextElement();
            }else{
                return null;
            }
        }
        return ele;
    }

    public void removeFirst(){
        if (this.getHead()!=null) {
            ELEMENT tmp = this.getHead();
            this.setHead(tmp.getNextElement());
        }
    }

    public void removeLast(){
        if (this.getTail()!=null) {
            ELEMENT tmp = this.getHead();
            ELEMENT prev = null;
            while (tmp.getNextElement()!=null){
                prev = tmp;
                tmp = tmp.getNextElement();
            }
            prev.setNextElement(null);
            this.setTail(prev);
        }
    }



}
