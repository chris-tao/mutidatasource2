package org.white.mutidatasource2.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.white.mutidatasource2.aop.DynamicDataSource;
import org.white.mutidatasource2.dao.AdminMapper;
import org.white.mutidatasource2.dto.AdminDTO;
import org.white.mutidatasource2.repository.AdminRepository;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: AdminRepositoryImpl.java, v 0.1 2018年09月06日 17:59:00 baixiong Exp$
 */
@Component
public class AdminRepositoryImpl implements AdminRepository {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    @DynamicDataSource(value = "backDataSource")
    public int addAdmin(AdminDTO adminDTO) {
        return adminMapper.insert(adminDTO);
    }
}
