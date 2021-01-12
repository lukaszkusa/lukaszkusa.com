package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u" +
            " left join fetch u.schools" +
            " left join fetch u.works" +
            " where u.id = ?1")
    public User findUserById(long id);
}
