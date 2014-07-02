import org.squeryl.Schema

object EmailSystem extends Schema {
  val emails = table[Email]("emails")
}