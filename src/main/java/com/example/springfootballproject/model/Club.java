package com.example.springfootballproject.model;

import javax.persistence.*;

@Entity
@Table (name = "clubs")
public class Club  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column (name = "nick_name")
    private String nickName;
    private String league;



    public Club() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return   name + " " +
                "(" + nickName + ", " + league + ")";
    }
}
