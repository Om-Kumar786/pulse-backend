package com.pulse.backend.dto;

public class AuthResponse {
    private Long id;
    private String username;
    private String role;
    private Boolean active;
    private String message;

    public AuthResponse() {}

    public AuthResponse(Long id, String username, String role, Boolean active, String message) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.active = active;
        this.message = message;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
