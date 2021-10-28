package ru.job4j.stream;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {
    @Test
    public void whenCollectAddressAllProfiles() {
        List<Profile> profilesClient = List.of(
                new Profile(new Address("Moscow", "Lovkacha", 15, 63)),
                new Profile(new Address("Kaliningrad", "Gromovoy", 63, 10)),
                new Profile(new Address("Smolensk", "Lenina", 6, 15))
        );
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(profilesClient);
        List<Address> expected = List.of(
                new Address("Moscow", "Lovkacha", 15, 63),
                new Address("Kaliningrad", "Gromovoy", 63, 10),
                new Address("Smolensk", "Lenina", 6, 15)
        );
        assertThat(rsl, is(expected));
    }

}