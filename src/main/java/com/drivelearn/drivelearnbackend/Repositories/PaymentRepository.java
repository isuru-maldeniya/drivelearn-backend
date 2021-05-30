package com.drivelearn.drivelearnbackend.Repositories;

import com.drivelearn.drivelearnbackend.Repositories.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
