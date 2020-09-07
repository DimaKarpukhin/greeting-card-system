package com.handson.greetingcards.entities;

import java.util.Objects;

public class GreetingCard {
    private String title;
    private String body;
    private String recipientName;
    private String senderName;
    private String imageUrl;

    public  GreetingCard(){}
    public GreetingCard(CardTemplate cardTemplate, String recipientName, String senderName) {
        if(cardTemplate != null) {
            this.title = cardTemplate.getTitle();
            this.body = cardTemplate.getBodyMsg();
            this.imageUrl = cardTemplate.getImageUrl();
        }
        this.recipientName = recipientName;
        this.senderName = senderName;
    }

    @Override
    public String toString() {
        return "GreetingCard{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", recipientName='" + recipientName + '\'' +
                ", senderName='" + senderName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GreetingCard that = (GreetingCard) o;
        return Objects.equals(title, that.title)
                && Objects.equals(body, that.body)
                && Objects.equals(recipientName, that.recipientName)
                && Objects.equals(senderName, that.senderName)
                && Objects.equals(imageUrl, that.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body, recipientName, senderName, imageUrl);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
}
