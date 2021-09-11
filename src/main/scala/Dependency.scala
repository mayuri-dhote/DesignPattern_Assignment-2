object Dependency extends App {
  trait Developer{
    def develop: Any = {}
  }
  class BackEndDeveloper extends Developer{
    override def develop: Any = writeJava()
    def writeJava(): Any = {println("Backend is coded in JAVA")}
  }
  class FrontEndDeveloper extends Developer{
    override def develop: Any = writeJavaScript()
    def writeJavaScript(): Any = {println("Frontend is coded in JS")}
  }
  class Project(var developers: List[Dependency.Developer]) {
    def implement(): Unit = {
      developers.foreach((d: Dependency.Developer) => d.develop)
    }
  }
  val back = new BackEndDeveloper
  val front = new FrontEndDeveloper
  val project = new Project(developers = List(back, front))
  project.implement
}
