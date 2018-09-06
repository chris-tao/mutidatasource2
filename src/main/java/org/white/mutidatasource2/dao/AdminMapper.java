package org.white.mutidatasource2.dao;


import org.white.mutidatasource2.dto.AdminDTO;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: AdminMapper.java, v 0.1 2018年09月05日 16:25:00 baixiong Exp$
 */
public interface AdminMapper {

    /**
     * 插入
     * @param adminDTO
     * @return
     */
    int insert(AdminDTO adminDTO);
}
