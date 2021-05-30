package com.drivelearn.drivelearnbackend.Repositories;

import com.drivelearn.drivelearnbackend.Repositories.Entity.Cource;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Cource,Integer> {
}
