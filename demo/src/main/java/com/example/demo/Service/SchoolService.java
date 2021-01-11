package pl.kusa.portfolio.Service;

import com.example.demo.Model.School;
import com.example.demo.Model.User;
import com.example.demo.Repository.SchoolRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final UserRepository userRepository;

    public School getSchoolById(long id) {
        return schoolRepository.getOne(id);
    }

    public School update(long id, School school) {
        School s = schoolRepository.getOne(id);
        s.setName(school.getName());
        s.setSpeciality(school.getSpeciality());
        s.setDirection(school.getDirection());
        s.setDiplomaWork(school.getDiplomaWork());
        s.setDegree(school.getDegree());
        s.setStartDate(school.getStartDate());
        s.setEndDate(school.getEndDate());
        return schoolRepository.save(s);
    }

    public SchoolService(SchoolRepository schoolRepository, UserRepository userRepository) {
        this.schoolRepository = schoolRepository;
        this.userRepository = userRepository;
    }

    public void add(School school, long id) {
        User u = userRepository.getOne(id);
        u.addSchool(school);
        userRepository.save(u);
        //schoolRepository.save(school);
    }

    public void remove(long id) {
        schoolRepository.deleteById(id);
    }
}
