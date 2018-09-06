package org.white.mutidatasource2.repository;

import org.white.mutidatasource2.dto.UserDTO;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: UserRepository.java, v 0.1 2018年09月06日 17:56:00 baixiong Exp$
 */
public interface UserRepository {

    /**
     * 新增用户
     * @param userDTO
     * @return
     */
    int addUser(UserDTO userDTO);
}
