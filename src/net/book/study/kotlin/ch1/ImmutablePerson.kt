package net.book.study.kotlin.ch1

data class ImmutablePerson(val name: String, val age: Int)

fun addAge(person: ImmutablePerson, num: Int): ImmutablePerson {
    return ImmutablePerson(person.name, person.age + num)
}