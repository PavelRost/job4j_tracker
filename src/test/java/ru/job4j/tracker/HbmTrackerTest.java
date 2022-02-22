package ru.job4j.tracker;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class HbmTrackerTest {

    @Test
    public void whenCreateAndFindById() {
        HbmTracker hbmTracker = new HbmTracker();
        Item item = new Item("test1");
        hbmTracker.add(item);
        assertThat(hbmTracker.findById(1).getName(), is("test1"));
    }

    @Test
    public void whenCreateAndFindByName() {
        HbmTracker hbmTracker = new HbmTracker();
        Item item = new Item("test2");
        hbmTracker.add(item);
        assertThat(hbmTracker.findByName("test2").get(0).getId(), is(1));
    }

    @Test
    public void whenFindAll() {
        HbmTracker hbmTracker = new HbmTracker();
        Item item = new Item("test2");
        Item item2 = new Item("test3");
        hbmTracker.add(item);
        hbmTracker.add(item2);
        assertThat(hbmTracker.findAll().size(), is(2));
    }

    @Test
    public void whenDeleteItem() {
        HbmTracker hbmTracker = new HbmTracker();
        Item item = new Item("test2");
        hbmTracker.add(item);
        assertTrue(hbmTracker.delete(hbmTracker.findByName("test2").get(0).getId()));
    }

    @Test
    public void whenUpdateItem() {
        HbmTracker hbmTracker = new HbmTracker();
        Item item = new Item("testOld", "DescOld");
        hbmTracker.add(item);
        Item itemNew = new Item("testNew", "DescNew");
        hbmTracker.replace(hbmTracker.findByName("testOld").get(0).getId(), itemNew);
        assertThat(hbmTracker.findByName("testNew").get(0).getName(), is("testNew"));
    }
}