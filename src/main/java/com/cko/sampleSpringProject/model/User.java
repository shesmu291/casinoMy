package com.cko.sampleSpringProject.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "password")
    private String password;

    @Column(name = "moneyWon")
    private int moneyWon;
    @Column(name = "moneyLost")
    private int moneyLost;
    @Column(name = "money")
    private int money;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {
            CascadeType.REFRESH,CascadeType.MERGE})
    @JoinTable(
            name ="users_authorities",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id")
    )
    private List<Authority> authorities;

    public User() {
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public User(String email, String password, List<Authority> authorities, int moneyWon, int moneyLost, int money ) {
        this.email = email;
        this.password = password;
        this.authorities = authorities;
        this.moneyWon = moneyWon;
        this.moneyLost = moneyLost;
        this.money = money;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoneyWon() {
        return moneyWon;
    }

    public int getMoneyLost() {
        return moneyLost;
    }

    public void setMoneyWon(int moneyWon) {
        this.moneyWon = moneyWon;
    }

    public void setMoneyLost(int moneyLost) {
        this.moneyLost = moneyLost;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return authorities;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                ", moneyWon='" + moneyWon + '\'' +
                ", moneyLost='" + moneyLost + '\'' +
                '}';
    }
}
