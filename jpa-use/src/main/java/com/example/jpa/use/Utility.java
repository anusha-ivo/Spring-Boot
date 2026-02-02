package com.example.jpa.use;

import jakarta.persistence.*;



@Entity
//@ToString
@Table(name = "person",
uniqueConstraints={
        @UniqueConstraint(name="name",
        columnNames = "name")

        })
public class Utility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   @Column(nullable = false)
    private String name;
    private int marks;
   @Column(name = "hobies")
    private String hoby;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getHoby() {
        return hoby;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

}
