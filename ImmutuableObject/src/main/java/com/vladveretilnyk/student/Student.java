package com.vladveretilnyk.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String group;
    private Map<Subject, Integer> marks;

    public Student(String name, int age, String group, Map<Subject, Integer> marks) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.marks = new HashMap<>(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Map<Subject, Integer> getMarks() {
        return new HashMap<>(marks);
    }

    public Student setMarks(Map<Subject, Integer> marks) {
        return new Student(this.name, this.age, this.group, new HashMap<>(marks));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }
}
