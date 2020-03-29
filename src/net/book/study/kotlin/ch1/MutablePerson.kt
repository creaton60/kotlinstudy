package net.book.study.kotlin.ch1

data class MutablePerson(var name: String, var age: Int)

fun addAge(person: MutablePerson, num: Int) {
    person.age += num
}