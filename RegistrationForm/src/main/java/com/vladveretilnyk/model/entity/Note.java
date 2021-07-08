package com.vladveretilnyk.model.entity;

import java.util.Objects;

public class Note {
    private String name;
    private String nickname;

    public Note() {
    }

    public Note(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(nickname, note.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
