package Model.Entities;

import java.time.LocalDate;

public class Project {
    private String title;
    private String domain;
    private String details;
    private LocalDate date;
    private Client proposedBy;
    private Status status;
    public Project(String title, String domain, String details, LocalDate date, Client proposedBy) {
        this.title = title;
        this.domain = domain;
        this.details = details;
        this.date = date;
        this.status = Status.NEW;
        this.proposedBy = proposedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getProposedBy() {
        return proposedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Project{" +
                "title='" + title + '\'' +
                ", domain='" + domain + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date +
                ", proposedBy=" + proposedBy +
                ", status=" + status +
                '}';
    }
}
