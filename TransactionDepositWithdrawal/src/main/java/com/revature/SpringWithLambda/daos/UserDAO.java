package com.revature.SpringWithLambda.daos;

import com.revature.SpringWithLambda.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRespository<User, Long> {

}
