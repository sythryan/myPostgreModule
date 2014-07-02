import org.squeryl.PrimitiveTypeMode._
import org.squeryl.annotations.Column
import java.util.Calendar

case class Email(@Column("sender") sender: String,
  @Column("recipient") recipient: String,
  @Column("content") content: String,
  @Column("timestamp") val timeStamp: java.util.Date = Calendar.getInstance().getTime())