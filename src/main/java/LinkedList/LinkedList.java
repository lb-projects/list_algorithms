package linkedlist;

public class LinkedList
{
    private Node head;

    public LinkedList()
    {
        head = null;
    }

    public void printInformation(){
        if (head != null) {
            head.printInformation();
        } else {
            System.out.println("No elements in list");
        }
    }

    public ListElement getHead()
    {
        return head;
    }


}