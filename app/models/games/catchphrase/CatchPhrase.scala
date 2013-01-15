package models.games.catchphrase

import play.api.libs.json._


case class CatchPhrase(phrase: String)

object CatchPhrase {

  implicit object JsonFormatter extends Format[CatchPhrase] {

    def reads(input: JsValue) = {
      CatchPhrase((input.as[JsObject] \ "phrase").as[String])
    }

    def writes(input: CatchPhrase): JsValue = Json.toJson(Map(
      "phrase" -> Json.toJson(input.phrase)
    ))
  }

}
