package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
//    private String value;
// i am not sure if I need to put this ^ here
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
        name = "Data not available"; // this sets a default value for the name field
    }
//    public Job(String value) {
//        this();
//        this.value = value;
//    }
    //I am not sure if I need to put this here ^
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        id = nextId;
        nextId++;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

 //   @Override
//    public String toString() {
//        return value;
//    }
//I am not sure that I need to put this here ^
 @Override
 public String toString() {
     String idString =  "\nID: " + getId() + "\n";
     String nameString = "Name: " + (getName().isEmpty() ? "Data not available" : getName()) + "\n";
     String employerString = "Employer: " + (getEmployer().getValue().isEmpty() ? "Data not available" : getEmployer().getValue()) + "\n";
     String locationString = "Location: " + (getLocation().getValue().isEmpty() ? "Data not available" : getLocation().getValue()) + "\n";
     String positionTypeString = "Position Type: " + (getPositionType().getValue().isEmpty() ? "Data not available" : getPositionType().getValue()) + "\n";
     String coreCompetencyString = "Core Competency: " + (getCoreCompetency().getValue().isEmpty() ? "Data not available" : getCoreCompetency().getValue()) + "\n";

     return idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString;
 }

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Job job = (Job) o;
    return getId() == job.getId();
}
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
