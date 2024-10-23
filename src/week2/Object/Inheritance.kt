package week2.Object

import week2.Class.Manager
import week2.Class.member

fun main() {

    val manager = Manager("Plugin")
    manager.sayHelo("Mobile")

    val member = member("aqna")
    member.sayHelo("Plugin")
}