package com.example.jpaexample.manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import  com.example.jpaexample.entity.user;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(value = false)
public class ManagerTest {
    @PersistenceContext
    private EntityManager em;

    @Test
    public void addUser() {
    user u =new user();
    u.setName("bo");
    em.persist(u);
    }
}
