package controllers

import play.api.mvc._
import play.api.libs.json._
import models.games.shibboleth.ShibbolethRepository

object ShibbolethService {
  def apply() = new ShibbolethService(ShibbolethRepository())
}

class ShibbolethService(private val repository: ShibbolethRepository) extends Controller {

  def next = Action {
    Ok(Json.toJson(repository.next())).withHeaders(CACHE_CONTROL -> "no-store")
  }
}
