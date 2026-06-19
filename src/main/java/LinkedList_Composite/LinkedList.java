package linkedlist_composite;

public class LinkedList
{
    private ListElement head;

    public LinkedList()
    {
        head = new Sentinel();
    }

    public void printInformation(){
        head.printInformation();
    }

    public ListElement getHead()
    {
        return head;
    }


}