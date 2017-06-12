package com.lpp.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by tangcheng on 2017/3/2.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//保证存取时有正确的格式
    private Date createDate;
    @ManyToOne
    @JoinColumn(name = "department_id")//user表中使用department_id字段来表示部门id
    @JsonBackReference//防止关系对象的递归访问
    private Department department;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "ID")})
    //中间表user_role来存在各自的id,以表示它们的对应关系
    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
