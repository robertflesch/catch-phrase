package models.games.shibboleth

import play.api.libs.json._

object Shibboleth {

  def apply(phrase: String) = new Shibboleth(phrase, None, None, None)

  def apply(phrase: String, who: String, where: String, year: Int) = new Shibboleth(phrase, Some(who), Some(where), Some(year))

  implicit object JsonFormatter extends Format[Shibboleth] {

    def reads(input: JsValue) = {
      Shibboleth((input.as[JsObject] \ "phrase").as[String])
    }

    def writes(input: Shibboleth): JsValue = Json.toJson(Map("phrase" -> Json.toJson(input.phrase)))
  }

}

case class Shibboleth(phrase: String, who: Option[String], where: Option[String], year: Option[Int])


