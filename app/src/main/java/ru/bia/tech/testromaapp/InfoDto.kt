package ru.bia.tech.testromaapp

class InfoDto {
    var city: String = ""
    var address: String = ""
    var distance: String = ""
    var workTime: String = ""

    constructor() {}

    constructor(city: String, address: String, distance: String, workTime: String) {
        this.city = city
        this.address = address
        this.distance = distance
        this.workTime = workTime
    }

}