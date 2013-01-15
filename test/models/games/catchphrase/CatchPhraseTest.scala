package models.games.catchphrase

import org.scalatest.FunSuite

import play.api.libs.json.Json

class CatchPhraseTest extends FunSuite {

  val scalaRepresentation = CatchPhrase("hello, world!")
  val jsonRepresentation = """{"phrase":"hello, world!"}"""

  test("Test write JSON") {
    assert(jsonRepresentation === Json.stringify(Json.toJson(scalaRepresentation)))
  }

  test("Test read JSON") {
    assert(scalaRepresentation == Json.fromJson[CatchPhrase](Json.parse(jsonRepresentation)))
  }
}
