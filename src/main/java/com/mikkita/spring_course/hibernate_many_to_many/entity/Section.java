package com.mikkita.spring_course.hibernate_many_to_many.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Section() {
    }

    public Section(String name) {
        this.name = name;
    }

    public void addChildToSection(Child child){
        if (children==null){
            children = new ArrayList<>();
        }
        children.add(child);
    }
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH
                          ,CascadeType.DETACH, CascadeType.MERGE})
    @JoinTable(
            name = "child_section"
            , joinColumns = @JoinColumn(name = "section_id")
            , inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Child> children;

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
