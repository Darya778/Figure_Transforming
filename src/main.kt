fun main() {
    val rect = Rect(0, 0, 5, 10)
    val circle = Circle(5f)
    val square = Square(4f)

    val figures: Array<Figure> = arrayOf(rect, circle, square)

    for (figure in figures) {
        println("Initial Area of ${figure::class.simpleName}: ${figure.area()}")

        if (figure is Transforming) {
            figure.resize(2)
            println("Resized Area of ${figure::class.simpleName}: ${figure.area()}")
        }

        if (figure is Transforming) {
            figure.rotate(RotateDirection.Clockwise, 0, 0)
            println("${figure::class.simpleName} rotated clockwise.")
        }

        if (figure is Movable) {
            figure.move(1, 1)
            println("${figure::class.simpleName} moved to new position.")
        }
    }
}
