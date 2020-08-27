package org.assignmentTracker.repository.user;

import org.assignmentTracker.entity.User;
import org.assignmentTracker.repository.IRepository;

import java.util.Set;

public interface UserRepository extends IRepository<User, Integer> {

    Set<User> getAll();

}
