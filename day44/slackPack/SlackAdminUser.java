package day44.slackPack;

public class  SlackAdminUser extends SlackUser {

    int adminId;
    public void sendAtChannelMessage() {
        System.out.println(name + " sending channel message");
    }

    public void deleteMessage() {
        System.out.println(name + " deleting slack messages");
    }

    public void addChannel() {
        System.out.println(name + " adding new channels");
    }

    public SlackAdminUser(String name, String status, int adminId) {
        this.adminId = adminId;
        this.name = name;
        this.status = status;
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SlackAdminUser u1= new SlackAdminUser("Rauf", "Java",314 );
        u1.sendMessage();
        u1.callSomeone();
        u1.addEmoji();
        // --- our own methods we are calling
        u1.addChannel();
        u1.deleteMessage();
        u1.sendAtChannelMessage();
        System.out.println("user1 = " + u1);
    }
}
