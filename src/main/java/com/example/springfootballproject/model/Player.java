package com.example.springfootballproject.model;

import javax.persistence.*;

@Entity
@Table (name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    private int age;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "club_id", referencedColumnName = "id")
    private Club club;

    public Player(String firstName, String lastName, int age, Club club) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.club = club;
    }

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                " | Last name: " + lastName +
                " | Age: " + age +
                " | Club: " + club + "|";
    }
}
