package com.brunaribeiro.meeting_room.entity;

import jakarta.persistence.*;

@Entity
@Table(name="room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true)
    private Long id;
    @Column(name="name", nullable = false, length = 20)
    private String name;

}
