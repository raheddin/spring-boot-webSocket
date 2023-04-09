package az.raheddin.springbootwebsocket.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
//@CrossOrigin(origins = "http://localhost:8080")
public class ChatController {

    @Autowired
    private SimpMessagingTemplate template;

    //@SendTo("/topic")
    //@SendToUser
    @MessageMapping("/chat")
    public void chatEndpoint(@Payload WsMessage wsMessage) {
        System.out.println(wsMessage);
        template.convertAndSend("/topic", wsMessage);
    }

}
