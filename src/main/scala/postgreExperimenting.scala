import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Schema
import org.squeryl.annotations.Column
import org.squeryl.Session
import org.squeryl.SessionFactory
import org.squeryl.adapters.PostgreSqlAdapter
import java.util.Calendar

case class Email(@Column("sender") sender: String, 
        @Column("recipient") recipient: String, 
        @Column("content") content: String,
        @Column("timestamp") val timeStamp:java.util.Date = Calendar.getInstance().getTime())