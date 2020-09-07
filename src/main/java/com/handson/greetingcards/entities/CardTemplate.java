package com.handson.greetingcards.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="card_templates")
public class CardTemplate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Long templateId;
    @Column(name="title")
    private String title;
    @Column(name="body")
    private String bodyMsg;
    @Column(name="image_url")
    private String imageUrl;


    public CardTemplate() {}

    public CardTemplate(String title, String bodyMsg, String imageUrl) {
        this.title = title;
        this.bodyMsg = bodyMsg;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "CardTemplate{" +
                "templateId=" + templateId +
                ", title='" + title + '\'' +
                ", bodyMsg='" + bodyMsg + '\'' +
                ", imageUrl='" + imageUrl + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardTemplate that = (CardTemplate) o;
        return Objects.equals(templateId, that.templateId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(bodyMsg, that.bodyMsg) &&
                Objects.equals(imageUrl, that.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, title, bodyMsg, imageUrl);
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyMsg() {
        return bodyMsg;
    }

    public void setBodyMsg(String bodyMsg) {
        this.bodyMsg = bodyMsg;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
