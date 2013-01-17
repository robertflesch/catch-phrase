package models.games.shibboleth

import org.scalatest.FunSuite

import play.api.libs.json.Json

class ShibbolethTest extends FunSuite {

  val scalaRepresentation = Shibboleth("hello, world!")
  val jsonRepresentation = """{"phrase":"hello, world!"}"""

  test("Test write JSON") {
    assert(jsonRepresentation === Json.stringify(Json.toJson(scalaRepresentation)))
  }

  test("Test read JSON") {
    assert(scalaRepresentation === Json.fromJson[Shibboleth](Json.parse(jsonRepresentation)))
  }
}
