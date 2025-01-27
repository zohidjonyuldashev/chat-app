package uz.zohidjon.chatapi.user;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private LocalDateTime lastSeen;
    private boolean isOnline;
}
