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
        projectList.add(new Project("LeafPlus", "IT", "Do this pls", LocalDate.now(), new Client("Alex", "Popa")));
        projectList.add(new Project("LeafMinus", "Design", "Do that", LocalDate.now(), new Client("Andrei", "Popica")));
        projectList.add(new Project("Joint<>", "IT", "Do nothing", LocalDate.now(), new Client("Raz", "Leaf")));
        projectList.add(new Project("Bong^", "Film/Photography", "Edit", LocalDate.now(), new Client("Simi", "Nimi")));
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
