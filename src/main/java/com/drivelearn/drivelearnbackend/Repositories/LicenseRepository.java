package com.drivelearn.drivelearnbackend.Repositories;

import com.drivelearn.drivelearnbackend.Repositories.Entity.License;
import org.springframework.data.repository.CrudRepository;

public interface LicenseRepository extends CrudRepository<License,Integer> {
}
