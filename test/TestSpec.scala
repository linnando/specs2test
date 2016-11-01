import org.specs2.concurrent.ExecutionEnv
import org.specs2.mutable
import play.api.test.WithApplicationLoader

import scala.concurrent.Future

class TestSpec extends mutable.Specification {
  "test1" >> { implicit ee: ExecutionEnv =>
    new WithApplicationLoader {
      //ok
      Future(1) must be_>(0).await
    }
  }
}
