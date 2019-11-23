package Service;

import Model.Entities.Student;
import Model.Utils.MyException;
import Repository.*;

import java.util.ArrayList;
import java.util.List;

public class ClientsService implements Dashboard <Student>{
    private StudentsRepository studentsRepo;
    public ClientsService(Repository repo){
        studentsRepo = (StudentsRepository)repo;
        //populate(studentsRepo.getAllStudents());
    }
    @Override
    public List<Student> populate(List<Student> objects) {
        return objects;
    }

    public List<Student> getAllStudents(){
        return populate(studentsRepo.getAllStudents());
    }
    public List<Student> filterByDomain(String dom){
        return populate(studentsRepo.getStudentsInDomain(dom));
    }

    public List<Student> filterByRating(int rating){
        return populate(studentsRepo.getStudentRatingGreater(rating));
    }

    public List<Student> filterOnlyStudent(String username) throws MyException {
        Student searchedStudent = studentsRepo.getStudentByUserName(username);
        List<Student> lst = new ArrayList<>();
        lst.add(searchedStudent);
        return populate(lst);
    }
}
