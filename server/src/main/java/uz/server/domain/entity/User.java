package uz.server.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name = "users")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @Id
    private Long id;

    @Column(name = "login")
    private String name;

    private String email;

    @JsonProperty("avatar_url")
    @Column(name = "avatar_url")
    private String avatarUrl;

    @JsonProperty("html_url")
    @Column(name = "github_profile")
    private String githubProfile;

    private String token;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "remaining_requests")
    private Integer remainingRequests;

    @Column(name = "connected_to_cli")
    private Boolean connectedToCLI;
}
