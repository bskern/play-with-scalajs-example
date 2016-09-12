package controllers

import com.google.inject.Inject
import play.api.{Configuration, Environment}
import play.api.mvc._
import shared.SharedMessages

class Application @Inject()(implicit config: Configuration) extends Controller {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

}
