//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val helicopter = Helicopter("Aligator", 5000, 400, 7000)
    println("Спроектировали вертолет с названием ${helicopter.name}, скоростью полета ${helicopter.speed}км/ч," +
            " весом ${helicopter.weight}кг, высотой полета ${helicopter.flyingHeight}м\n")

//2
    val pet = Pet(5, "Сейла", "кошка")
    println("Домашнее животное: ${pet.type}\nКличка: ${pet.name}\nВес: ${pet.weight}кг\n")

//3
    var number = 5.87
    println(number)
    println(number.toInt())
}