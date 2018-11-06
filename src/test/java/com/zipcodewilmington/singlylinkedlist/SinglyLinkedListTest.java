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
        list.addToStart("Apples");
        list.addToStart("oranges");
        list.addToStart("bananas");
        int expected = 3;
        int actual = list.size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void sizeTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart("Apples");
        int expected = 1;
        int actual = list.size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void getTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart("Apples");
        String expected = "Apples";
        String actual = list.get(1);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void containsTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart("Apples");
        boolean expected = true;
        boolean actual = list.contains("Apples");

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void findIndexTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart("Apples");
        int expected = 1;
        int actual = list.findIndex("Apples");

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void copyTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart("Apple");
        list.addToStart("Microsoft");
        list.addToStart("Google");
        SinglyLinkedList copylist = list.copyList();
        Assert.assertTrue(!list.equals(copylist));
    }

    @Test
    public void removeTest()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToStart("Apple");
        list.addToStart("Microsoft");
        list.addToStart("Google");
        list.remove(2);
        int expected=2;
        int actual = list.size();
        Assert.assertEquals(expected,actual);
    }


}
