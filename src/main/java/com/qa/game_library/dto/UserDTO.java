package com.qa.game_library.dto;

import com.qa.game_library.domain.Library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String email;
    private Date dateOfBirth;

    private List<LibraryDTO> libraries = new ArrayList<>();

    public UserDTO() {
    }

    public UserDTO(String username, String password, String email, Date dateOfBirth) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;

    }

    public List<LibraryDTO> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<LibraryDTO> libraries) {
        this.libraries = libraries;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
