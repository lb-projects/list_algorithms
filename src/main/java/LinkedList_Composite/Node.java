package linkedlist_composite;

public class Node extends ListElement
{
    private ListElement nextElement;
    private DataElement data;

    public Node(DataElement data)
    {
        this.data = data;
        nextElement = new Sentinal();
    }

    public Node(DataElement data, ListElement nextElement)
    {
        this.data = data;
        this.nextElement = nextElement;
    }

    public void printInformation()
    {
        data.printInformation();
    }

    public DataElement getData()
    {
        return data;
    }

    public ListElement getNextElement()
    {
        return nextElement;
    }


}