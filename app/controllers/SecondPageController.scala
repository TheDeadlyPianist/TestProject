package controllers

import play.api.mvc.{Action, AnyContent, ControllerComponents}
import utils.FrontendController
import views.html.SecondPageView

import javax.inject.Inject

class SecondPageController@Inject()(
                                   view: SecondPageView,
                                   cc: ControllerComponents
                                 ) extends FrontendController(cc) {

  def show(): Action[AnyContent] = Action { implicit request =>
    Ok(view())
  }
  
}
