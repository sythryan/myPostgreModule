import org.squeryl.SessionFactory
import org.squeryl.Session
import org.squeryl.adapters.PostgreSqlAdapter
import org.squeryl.PrimitiveTypeMode._

object connect extends Application {

  Class.forName("org.postgresql.Driver")
  SessionFactory.concreteFactory = Some(()=>
    Session.create(
      java.sql.DriverManager.getConnection("jdbc:postgresql://localhost/exampleDatabase", "syth", "Tyfugi2"),
      new PostgreSqlAdapter()))

  transaction {
    EmailSystem.emails.insert(Email("Joe", "John", "Hello John"))
    EmailSystem.emails.insert(Email("Ping", "Pong", "0ms response"))
  }

  transaction {
    val queriedEmails:List[Email] = from(EmailSystem.emails)(e => select(e)).toList

    queriedEmails.foreach(printEmail)
  }