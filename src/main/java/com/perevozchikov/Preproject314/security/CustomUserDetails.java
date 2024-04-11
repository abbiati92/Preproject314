package com.perevozchikov.Preproject314.security;

import com.perevozchikov.Preproject314.model.Role;
import com.perevozchikov.Preproject314.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CustomUserDetails extends User implements UserDetails {

    @Override
    public Set<? extends GrantedAuthority> getAuthorities() {
        return getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public Integer getId() {
        return super.getId();
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
    public String getName() {
        return super.getName();
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public Set<Role> getRoles() {
        return super.getRoles();
    }

    @Override
    public String getLastname() {
        return super.getLastname();
    }
}