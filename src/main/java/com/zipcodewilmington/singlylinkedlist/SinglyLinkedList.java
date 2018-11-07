package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private class Node
    {
        private int item;
        private Node link;

        public Node()
        {
            link = null;
            item = 0;
        }

        public Node (int newItem, Node linkValue)
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

    public void addToStart(int item)
    {
        head = new Node(item, head);
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

    public boolean contains(int item)
    {
        return(find(item) != null);

    }

    private Node find(int target)
    {
        Node position = head;
        int itemAtPosition;
        while (position != null)
        {
        itemAtPosition = position.item;
        if (itemAtPosition==(target))
            return position;
        position = position.link;
        }
        return null;
        }

        public int get(int index)
        {
            Node position = head;
            int itemAtPosition;
            int i=0;
            while (position != null)
            {
                i++;
                itemAtPosition = position.item;
            if (index == i)
                return itemAtPosition;
            position=position.link;
            }
            return -1;
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

        public int findIndex(int target){

            Node position = head;
            int itemAtPosition;
            int i=0;
            while (position != null)
            {
                i++;
                itemAtPosition = position.item;
                if (itemAtPosition==(target))
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

        public void Sort()
        {
            boolean sorted = false;
            Node position = head;
            int temp = 0;

            while (position!=null && sorted != true) {
                sorted=true;
                for(int i = 0;i<size();i++)
                if (position.item > position.link.item)
                {
                    temp = position.link.item;
                    position.link.item=position.item;
                    position.item=temp;
                    sorted=false;
                }
                position=position.link;
        }
        }

}