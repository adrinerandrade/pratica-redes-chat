package model;

public class Message {

    private int from;
    private String content;

    public Message(int from, String content) {
        this.from = from;
        this.content = content;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from=" + from +
                ", content='" + content + '\'' +
                '}';
    }

}
