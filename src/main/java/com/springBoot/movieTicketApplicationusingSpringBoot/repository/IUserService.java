package com.springBoot.movieTicketApplicationusingSpringBoot.repository;

import com.springBoot.movieTicketApplicationusingSpringBoot.Entity.User;

public interface IUserService {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
