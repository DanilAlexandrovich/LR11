package e8;

public class Example
{
    public static void main(String[] args)
    {
        Node head = new Node(1, null);
        System.out.println(head);
        head.createHead(2);
        System.out.println(head);
        head.createTail(3);
        System.out.println(head);
        head.AddFirst(4);
        System.out.println(head);
        head.AddLast(5);
        System.out.println(head);
        head.Insert(2, 6);
        System.out.println(head);
        head.RemoveFirst();
        System.out.println(head);
        head.RemoveLast();
        System.out.println(head);
        head.Remove(2);
        System.out.println(head);
    }
}
