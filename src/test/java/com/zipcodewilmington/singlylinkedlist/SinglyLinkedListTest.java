package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
  @Test
    public void addTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(1);
        list.addToStart(2);
        list.addToStart(3);
        int expected = 3;
        int actual = list.size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void sizeTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(1);
        int expected = 1;
        int actual = list.size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void getTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(1);
        int expected = 1;
        int actual = list.get(1);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void containsTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(1);
        boolean expected = true;
        boolean actual = list.contains(1);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void findIndexTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(1);
        int expected = 1;
        int actual = list.findIndex(1);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void copyTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(1);
        list.addToStart(2);
        list.addToStart(3);
        SinglyLinkedList copylist = list.copyList();
        Assert.assertTrue(!list.equals(copylist));
    }

    @Test
    public void removeTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(1);
        list.addToStart(2);
        list.addToStart(3);
        list.remove(2);
        int expected=2;
        int actual = list.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart(5);
        list.addToStart(4);
        list.addToStart(2);
        list.addToStart(1);
        list.addToStart(3);
        list.Sort();
        int expected = 3;
        int actual = list.findIndex(3);
        Assert.assertEquals(expected,actual);

    }


}
