package org.launchcode.techjobs.oo;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
public class JobTest {
    //TODO: Create your unit tests here
    private Job job1;
    private Job job2;

    @Test
    public void testSettingJobId() {
        job1 = new Job();
        job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job.getName() instanceof String);
        assertEquals("Product tester", job.getName());

        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job1, job2);
    }

}
