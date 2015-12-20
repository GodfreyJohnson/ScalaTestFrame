import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Created by godfrey on 15-12-19.
 */
class AlbumSpec extends FunSpec with ShouldMatchers{
  describe("An Album"){
    it("can add an Artist object to the album"){
      val album = new Album("Lakers", 1981, new Artist("godfrey", "johnson"))
      album.artist.firstName should be("godfrey")
    }

  }
}
