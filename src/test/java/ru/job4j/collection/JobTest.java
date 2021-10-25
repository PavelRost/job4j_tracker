package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorDescByName() {
        List<Job> list = Arrays.asList(new Job("Fedor", 2), new Job("Fedor", 1), new Job("AAA", 3));
        Collections.sort(list, new JobDescByName());
        assertThat(list.get(0).getName(), is("Fedor"));
    }

    @Test
    public void whenComparatorDescByPriority() {
        List<Job> list = Arrays.asList(new Job("Fedor", 2), new Job("Fedor", 1), new Job("AAA", 3));
        Collections.sort(list, new JobDescByPriority());
        assertThat(list.get(0).getPriority(), is(3));
    }

    @Test
    public void whenComparatorAscByName() {
        List<Job> list = Arrays.asList(new Job("Fedor", 2), new Job("Fedor", 1), new Job("AAA", 3));
        Collections.sort(list, new JobAscByName());
        assertThat(list.get(0).getName(), is("AAA"));
    }

    @Test
    public void whenComparatorAscByPriority() {
        List<Job> list = Arrays.asList(new Job("Alex", 1), new Job("Fedor", 2), new Job("AAA", 3));
        Collections.sort(list, new JobAscByPriority());
        assertThat(list.get(0).getPriority(), is(1));
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        List<Job> list = Arrays.asList(new Job("Alex", 1), new Job("Fedor", 2), new Job("AAA", 3),
                new Job("AAA", 2));
        Comparator<Job> comp = new JobAscByName().thenComparing(new JobAscByPriority());
        Collections.sort(list, comp);
        assertThat(list.get(0).getPriority(), is(2));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}

