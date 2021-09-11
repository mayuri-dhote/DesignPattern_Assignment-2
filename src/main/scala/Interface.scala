trait Athlete{
  def highJump(): Unit={}
}
trait Shooting{
  def fiftyMeter():Unit={}
}
class Tom extends Athlete{
  override def highJump():Unit = println("Tom won the gold medal in HighJump")
}
class Binod extends Shooting{
  override def fiftyMeter(): Unit = println("Binod won the gold medal in Shooting")
}
object Interface extends App{
  val Data1 = new Tom
  Data1.highJump()
  val Data2 = new Binod
  Data2.fiftyMeter()
}
