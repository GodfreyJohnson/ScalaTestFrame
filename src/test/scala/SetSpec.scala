import java.util.NoSuchElementException

import org.scalatest.{GivenWhenThen, FlatSpec}

import scala.collection.mutable

/**
  * Created by godfrey on 15-12-20.
  */
class SetSpec extends FlatSpec with GivenWhenThen{

//  info("info is recorded")
//  markup("markup is also recorded")
//  note("notes are sent immediately")
//  alert("alerts are also sent immediately")
//
//
//  Given("An Empty Set")
//  val set = mutable.Set.empty[String]
//
//  When("set can add a new element")
//  set += "godfrey"
//
//  Then("set should have size of 1")
//  assert(set.size == 1)
//
//  And("set has element called godfrey")
//  //assert(set.contains("godfrey"))
//
//  //markup("This test finished with a **bold** statement!")

  "An empty Set" should " have set 0" in (pending)
  it should "procedure NoSuchElementException when set is invoked " in{
    intercept[NoSuchElementException]{
      Set.empty.head
    }
  }
}
