package Service;

import Model.Entities.Project;
import Repository.ClientRepository;
import Repository.ProjectRepository;
import Repository.Repository;

import java.util.List;

public class StudentService implements Dashboard<Project> {

    private ProjectRepository projectRepository;

    public StudentService(ProjectRepository projectRepository, Repository clientRepository) {
        this.projectRepository = projectRepository;
        this.clientRepository = clientRepository;
    }

    private Repository clientRepository;
    public StudentService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> populate(List<Project> objects) {
        return objects;
    }

    public List<Project> getAll() {
        return populate(projectRepository.getAll());
    }

    public List<Project> getByDomain(String domain) {
        return populate(projectRepository.getByDomain(domain));
    }

    public List<Project> getAvailable() {
        return populate(projectRepository.getAvailable());
    }

    public boolean validClientUserPwd(String username,String pwd){
        return ((ClientRepository)clientRepository).validPwd(username,pwd);
    }

}
