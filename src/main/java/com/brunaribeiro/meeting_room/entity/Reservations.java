package com.brunaribeiro.meeting_room.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;



@Entity
@Table(name="reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    private String room_id;

    @Column(name="title",nullable = false, length = 50)
    private  String title;
    @Column(name="description",nullable = false, length = 200)
    private String description;

    @Column(name="date",nullable = false)
    private LocalDate date;
    @Column(name="datahora",nullable = false)
    private LocalDateTime datahora;
    @Column(name="datafim",nullable = false)
    private LocalDateTime datafim;
    @Column(name="duration",nullable = false)
    private Integer duration;
}
