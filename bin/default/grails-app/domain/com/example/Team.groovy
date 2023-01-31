package com.example

class Team {
    String name
    String location
    List<Player> players

    static hasMany = [players: Player]

    static constraints = {
    }
}
