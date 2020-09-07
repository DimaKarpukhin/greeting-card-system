package com.handson.greetingcards.entities;

import java.util.Objects;

public class CardOrder {
    private Long templateId;
    private String recipientName;
    private String senderName;

    public CardOrder(){}

    public CardOrder(Long templateId, String recipientName, String senderName) {
        this.templateId = templateId;
        this.recipientName = recipientName;
        this.senderName = senderName;
    }

    @Override
    public String toString() {
        return "CardOrder{"
                + "templateId='" + templateId + '\''
                + ", recipientName='" + recipientName + '\''
                + ", senderName='" + senderName + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardOrder cardOrder = (CardOrder) o;
        return Objects.equals(templateId, cardOrder.templateId)
                && Objects.equals(recipientName, cardOrder.recipientName)
                && Objects.equals(senderName, cardOrder.senderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, recipientName, senderName);
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
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
