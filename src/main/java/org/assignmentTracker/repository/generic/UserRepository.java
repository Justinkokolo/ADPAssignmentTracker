package org.assignmentTracker.repository.generic;

import org.assignmentTracker.entity.User;
import org.assignmentTracker.repository.generic.IRepository;

import java.util.Set;

public interface UserRepository extends IRepository<User, Integer> {

    Set<User> getAll();

}
