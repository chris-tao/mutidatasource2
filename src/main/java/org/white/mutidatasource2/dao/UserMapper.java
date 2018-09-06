package org.white.mutidatasource2.dao;


import org.white.mutidatasource2.dto.UserDTO;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: UserMapper.java, v 0.1 2018年09月05日 16:24:00 baixiong Exp$
 */
public interface UserMapper {

    /**
     * 插入
     * @param userDTO
     * @return
     */
    int insert(UserDTO userDTO);
}
