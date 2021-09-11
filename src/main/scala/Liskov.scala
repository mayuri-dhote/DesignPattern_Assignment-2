class Rectangle {
  private var length = 0
  private var breadth = 0

  def getLength: Int = length

  def setLength(length: Int): Unit = {
    this.length = length
  }

  def getBreadth: Int = breadth

  def setBreadth(breadth: Int): Unit = {
    this.breadth = breadth
  }

  def getArea: Int = this.length * this.breadth
}

class Square extends Rectangle {
  override def setBreadth(breadth: Int): Unit = {
    super.setBreadth(breadth)
    super.setLength(breadth)
  }

  override def setLength(length: Int): Unit = {
    super.setLength(length)
    super.setBreadth(length)
  }
}
object Liskov extends App{
  val Shapes = new Square
  Shapes.setLength(22)
  Shapes.setBreadth(24)
  println(Shapes.getArea)

}
