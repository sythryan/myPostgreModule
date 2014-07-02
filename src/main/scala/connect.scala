import org.squeryl.SessionFactory
import org.squeryl.Session
import org.squeryl.adapters.PostgreSqlAdapter

object connect extends Application {

  Class.forName("org.postgresql.Driver")
  SessionFactory.concreteFactory = Some(()=>
      Session.create(
          java.sql.DriverManager.getConnection("jdbc:postgresql://localhost/exampleDatabase", "username", "password"),
          new PostgreSqlAdapter()))
}