package uz.zohidjon.chatapi.message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    @Query(name = MessageConstants.FIND_MESSAGES_BY_CHAT_ID)
    List<Message> findMessagesByChatId(String chatId);

    @Modifying
    @Query(name = MessageConstants.SET_MESSAGES_TO_SEEN_BY_CHAT)
    void setMessagesToSeenByChatId(@Param("chatId") String chatId, @Param("newState") MessageState messageState);
}
