package Repository;

import Model.Entities.Student;
import Model.Utils.MyException;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentsRepository implements Repository {
    private HashMap<String, Student> studentUserNames;
    private HashMap<String, String> userPasswords;

    public StudentsRepository() {
        studentUserNames = new HashMap<>();
        userPasswords = new HashMap<>();
    }
    public int getSize(){
        return studentUserNames.size();
    }
    public List<Student> getAllStudents(){
        return (List<Student>)studentUserNames.values();
    }
    public List<Student> getStudentsInDomain(String domain){
        return studentUserNames.values().stream()
                .filter(s -> s.getSkills().equals(domain))
                .collect(Collectors.toList());
    }
    public List<Student> getStudentRatingGreater(int rating){
        return studentUserNames.values().stream()
                .filter(s->s.getRating()>rating)
                .collect(Collectors.toList());
    }
    public Student getStudentByUserName(String username) throws MyException {
        if (studentUserNames.containsKey(username))
            return studentUserNames.get(username);
        else throw new MyException("Sorry, no user name found by that name.");
    }

    @Override
    public void register(String username, String pwd, Object obj) {
        Student std = (Student) obj;
        userPasswords.put(username,pwd);
        studentUserNames.put(username,std);
    }
}
