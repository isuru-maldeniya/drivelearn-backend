package com.drivelearn.drivelearnbackend.Repositories;

import com.drivelearn.drivelearnbackend.Repositories.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
