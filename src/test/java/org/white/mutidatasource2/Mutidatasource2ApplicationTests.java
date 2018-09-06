package org.white.mutidatasource2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.white.mutidatasource2.dto.AdminDTO;
import org.white.mutidatasource2.dto.UserDTO;
import org.white.mutidatasource2.repository.AdminRepository;
import org.white.mutidatasource2.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mutidatasource2ApplicationTests {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private UserRepository  userRepository;

    @Test
    public void contextLoads() {
        AdminDTO admin = new AdminDTO();
        admin.setAdminId("5");
        admin.setAdminName("admin5");
        UserDTO user = new UserDTO();
        user.setUserId("5");
        user.setUserName("user5");

        int userCount = userRepository.addUser(user);
        int adminCount = adminRepository.addAdmin(admin);
        Assert.assertTrue("用户插入失败", userCount == 1);
        Assert.assertTrue("管理员插入失败", adminCount == 1);
    }

}
