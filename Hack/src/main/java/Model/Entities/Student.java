package Model.Entities;

import java.util.List;

public class Student {
    private String fname,lname, studies;
    private int rating;
    private List<Project> projects;
    private List<String>skills;
    private String email;
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Model.Entities.Student{" +
                "first name='" + fname + '\'' +
                ", last name='" + lname + '\'' +
                ", studies='" + studies + '\'' +
                ", rating=" + rating +
                ", projects=" + projects +
                ", skills=" + skills +
                '}';
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }



    public Student(String fname, String lname, String studies, int rating, List<Project> projects, List<String> skills, String email) {
        this.fname = fname;
        this.lname = lname;
        this.studies = studies;
        this.rating = rating;
        this.projects = projects;
        this.skills = skills;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
