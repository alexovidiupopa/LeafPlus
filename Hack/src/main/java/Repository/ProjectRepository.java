package Repository;

import Model.Entities.Client;
import Model.Entities.Project;
import Model.Entities.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectRepository {
    private List<Project> projectList;

    public ProjectRepository() {
        projectList = new ArrayList<>();
        projectList.add(new Project("BankingApp", "IT", "We need a WEB application that can manage online payments into a certain account. Feel free to use any technologies.", LocalDate.now(), new Client("Alex", "Popa")));
        projectList.add(new Project("Event Poster", "Design", "The big charity concert is coming up, and therefore my organisation and I are looking for a design which accurately depicts what we are trying to achieve.", LocalDate.now(), new Client("Andrei", "Popica")));
        projectList.add(new Project("Trip planner", "IT", "We need a calendar-like app to help us manage our trip schedule.", LocalDate.now(), new Client("Raz", "HiddenLeaf")));
        projectList.add(new Project("Festival Crew", "Film/Photography", "With the big music festival right around the corner, we're looking for passionate photographers and videographers to help us at the event.", LocalDate.now(), new Client("Simi", "Nimi")));
    }

    public List <Project> getAll() {
        return projectList;
    }

    public List <Project> getByDomain(String domain) {
        return projectList.stream()
                .filter(project -> project.getDomain().equals(domain))
                .collect(Collectors.toList());
    }

    public List <Project> getAvailable() {
        return projectList.stream()
                .filter(project -> project.getStatus().equals(Status.NEW))
                .collect(Collectors.toList());
    }
}
