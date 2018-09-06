package org.white.mutidatasource2.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.white.mutidatasource2.dao.UserMapper;
import org.white.mutidatasource2.dto.UserDTO;
import org.white.mutidatasource2.repository.UserRepository;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: UserRepositoryImpl.java, v 0.1 2018年09月06日 17:57:00 baixiong Exp$
 */
@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    public int addUser(UserDTO userDTO) {
        return userMapper.insert(userDTO);
    }
}
