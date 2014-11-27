/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;

/**
 * This class can be used as a serializable object between a cliend and
 * a server in a chat program.
 * 
 * @author Ohjelmistokehitys
 */
public class ChatMessage implements Serializable {
    
    private String username;
    private String chatMessage;
    private String messageColor;
    private int fontSize;
    private boolean isPrivate;
    private String privateName;
    private boolean usernameChange = false;
    private boolean userListUpdate = false;

    public boolean isUserListUpdate() {
        return userListUpdate;
    }

    public void setUserListUpdate(boolean userListUpdate) {
        this.userListUpdate = userListUpdate;
    }

    public boolean isUsernameChange() {
        return usernameChange;
    }

    public void setUsernameChange(boolean usernameChange) {
        this.usernameChange = usernameChange;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public String getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(String messageColor) {
        this.messageColor = messageColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        if (fontSize >= 10 || fontSize <= 20)
            this.fontSize = fontSize;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }
    
    
}
