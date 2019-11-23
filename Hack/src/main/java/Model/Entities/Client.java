package Model.Entities;

import java.util.List;

public class Client {
    private String fname, lname;
    //private List<Model.Entities.Project> proposedProjects,previousProjects;

    public Client(String fname, String lname ) {
        this.fname = fname;
        this.lname = lname;

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


}
