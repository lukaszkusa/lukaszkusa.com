package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Model.Work;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkService {

    protected final WorkRepository workRepository;
    protected final UserRepository userRepository;

    public Work update(long id, Work work) {
        Work w = workRepository.getOne(id);
        w.setCompany(work.getCompany());
        w.setCity(work.getCity());
        w.setPosition(work.getPosition());
        w.setStartDate(work.getStartDate());
        w.setStartEnd(work.getStartEnd());
        w.setResponsibilities(work.getResponsibilities());
        return workRepository.save(w);
    }

    public void add(long user_id, Work work) {
        User u = userRepository.getOne(user_id);
        u.addWork(work);
        userRepository.save(u);
    }

    public void remove(long id) {
        workRepository.deleteById(id);
    }
}
