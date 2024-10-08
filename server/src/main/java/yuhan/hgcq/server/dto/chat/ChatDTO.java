package yuhan.hgcq.server.dto.chat;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChatDTO implements Serializable {
    private Long chatId;
    private Long writerId;
    private String writerName;
    private String message;
    private LocalDateTime time;
}
