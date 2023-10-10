package org.launchcode.techjobs.oo;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
public class JobTest {
    //TODO: Create your unit tests here
    private Job job1;
    private Job job2;
    private final String newLine = System.lineSeparator();

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

        assertNotEquals(job1, job2);
    }

@Test
public void testToStringStartsAndEndsWithNewLine() {
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String toStringResult = job.toString();
    // Check if the first and last characters are new lines
    assertTrue(toStringResult.startsWith("\n"));
    assertTrue(toStringResult.endsWith("\n"));
}
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toString = job.toString();

        assertTrue(toString.contains("ID: " + job.getId()));
        assertTrue(toString.contains("Name: Product tester"));
        assertTrue(toString.contains("Employer: ACME"));
        assertTrue(toString.contains("Location: Desert"));
        assertTrue(toString.contains("Position Type: Quality control"));
        assertTrue(toString.contains("Core Competency: Persistence"));
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String toString = job.toString();

        assertTrue(toString.contains("Name: Data not available"));
        assertTrue(toString.contains("Employer: Data not available"));
        assertTrue(toString.contains("Location: Data not available"));
        assertTrue(toString.contains("Position Type: Data not available"));
        assertTrue(toString.contains("Core Competency: Data not available"));
    }
}
