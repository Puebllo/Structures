package c6_DoublyLinkedList.model;

public class MockDTO {

    private String login;
    private String email;
    private Long sessionId;

    public MockDTO(String login, String email, Long sessionId) {
        this.login = login;
        this.email = email;
        this.sessionId = sessionId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return getLogin() + " " + getSessionId();
    }
}
