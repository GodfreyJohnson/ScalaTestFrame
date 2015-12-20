import org.scalatest.{FunSpec, ShouldMatchers, FlatSpec}

/**
  * Created by godfrey on 15-12-19.
  */
class ListSpec extends FunSpec with ShouldMatchers{
  describe("list size test"){
    it("list size should be 3 now"){
      val list = 2::4::5::Nil
      list.size should be(3)
    }
  }
}