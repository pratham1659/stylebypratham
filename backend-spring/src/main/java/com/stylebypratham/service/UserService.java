package com.stylebypratham.service;

import com.stylebypratham.exception.UserException;
import com.stylebypratham.modal.User;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

}
