package uz.server.ws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
public class SessionHolder {
    public static ConcurrentHashMap<String, WebSocketSession> sessions = new ConcurrentHashMap<>();

    public void addSession(String id, WebSocketSession session) {
        log.info("Adding session with id: {}", id);
        sessions.put(id, session);
    }

    public WebSocketSession getSession(String id) {
        log.info("Getting session with id: {}", id);
        return sessions.get(id);
    }

    public void removeSession(String id) {
        log.info("Removing session with id: {}", id);
        sessions.remove(id);
    }

    public boolean hasSession(String id) {
        log.info("Checking session with id: {}", id);
        return sessions.containsKey(id);
    }
}
