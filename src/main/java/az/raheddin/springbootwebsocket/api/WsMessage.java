package az.raheddin.springbootwebsocket.api;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WsMessage {
    private String user;
    private String msj;
}
