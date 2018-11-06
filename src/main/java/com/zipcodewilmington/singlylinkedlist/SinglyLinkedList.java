package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private class Node
    {
        private String item;
        private Node link;

        public Node()
        {
            link = null;
            item = null;
        }

        public Node (String newItem, Node linkValue)
        {
            item = newItem;
            link = linkValue;
        }
    }

    private Node head;

    public SinglyLinkedList()
    {
        head = null;
    }

    public void addToStart(String itemName)
    {
        head = new Node(itemName, head);
    }

    public int size()
    {
        int count =0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(String item)
    {
        return(find(item) != null);

    }

    private Node find(String target)
    {
        Node position = head;
        String itemAtPosition;
        while (position != null)
        {
        itemAtPosition = position.item;
        if (itemAtPosition.equals(target))
            return position;
        position = position.link;
        }
        return null;
        }

        public String get(int index)
        {
            Node position = head;
            String itemAtPosition;
            int i=0;
            while (position != null)
            {
                i++;
                itemAtPosition = position.item;
            if (index == i)
                return itemAtPosition;
            position=position.link;
            }
            return null;
        }

        public void remove (int index) {
            Node position = head;
            if (index == 0) {
                head = head.link;
            }
            int i = 0;
            while (position != null && i < index - 1) {
                i++;
                position = position.link;
            }
            if (position == null || position.link == null)
                return;

            position.link = position.link.link;
        }

        public int findIndex(String target){

            Node position = head;
            String itemAtPosition;
            int i=0;
            while (position != null)
            {
                i++;
                itemAtPosition = position.item;
                if (itemAtPosition.equals(target))
                    return i;
                position = position.link;
            }
            return -1;

        }

        public SinglyLinkedList copyList()
        {
            Node position = head;
            Node copynode = new Node();
            SinglyLinkedList copy = new SinglyLinkedList();
            while (position!=null) {
                copynode.item = position.item;
                copynode.link = position.link;
                position=position.link;
            }
            return copy;
        }
}