package com.google.firebase.udacity.friendlychat;

/**
 * Created by kshitiz on 13/4/17.
 */
public class AnswerMessage {

    private String text;
    private String name;
    private String photoUrl;
    private long qid;

    public AnswerMessage() {
    }

    public AnswerMessage(String text, String name, String photoUrl, long qid) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.qid = qid;
    }

    public void setQid(int qid) { this.qid = qid;}

    public long getQid() { return qid; }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
