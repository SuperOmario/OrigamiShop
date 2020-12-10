package Utils;

/**
 *
 * @author Omar
 */

/*
Helper class to give helpful alerts to the user
*/
public class Message {
    private String messageText;
    private String messageType;

    /**
     * @return the messageText
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * @param messageText the messageText to set
     */
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    /**
     * @return the messageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * @param messageType the messageType to set
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    
    public Message(String messageText, String messageType){
        this.messageText = messageText;
        this.messageType = messageType;
    }
}
