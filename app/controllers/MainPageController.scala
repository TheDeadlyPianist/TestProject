package controllers

import play.api.mvc.{Action, AnyContent, ControllerComponents}
import utils.FrontendController
import views.html.MainPageView

import javax.inject.Inject

class MainPageController@Inject()(
                                   view: MainPageView,
                                   controllerComponents: ControllerComponents
                                 ) extends FrontendController(controllerComponents) {

  def show(): Action[AnyContent] = Action { implicit request =>
    Ok(view())
  }
  
}
