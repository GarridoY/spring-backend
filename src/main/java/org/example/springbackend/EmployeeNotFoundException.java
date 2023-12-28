package org.example.springbackend;

/**
 * @author Daniél Garrido
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
