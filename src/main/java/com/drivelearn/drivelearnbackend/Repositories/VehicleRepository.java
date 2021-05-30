package com.drivelearn.drivelearnbackend.Repositories;

import com.drivelearn.drivelearnbackend.Repositories.Entity.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle,Integer> {
}
