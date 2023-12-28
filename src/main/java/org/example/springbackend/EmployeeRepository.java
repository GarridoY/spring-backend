package org.example.springbackend;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daniél Garrido
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
