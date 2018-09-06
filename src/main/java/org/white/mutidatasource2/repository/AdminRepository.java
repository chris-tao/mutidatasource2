package org.white.mutidatasource2.repository;

import org.white.mutidatasource2.dto.AdminDTO;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: AdminRepository.java, v 0.1 2018年09月06日 17:56:00 baixiong Exp$
 */
public interface AdminRepository {

    /**
     * 新增管理员
     * @param adminDTO
     * @return
     */
    int addAdmin(AdminDTO adminDTO);
}
