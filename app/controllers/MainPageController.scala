package controllers

import play.api.i18n.I18nSupport
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import views.html.MainPageView

import javax.inject.Inject

class MainPageController@Inject()(
                                   view: MainPageView,
                                   val controllerComponents: ControllerComponents
                                 ) extends BaseController with I18nSupport {

  def show(): Action[AnyContent] = Action { implicit request =>
    Ok(view())
  }
  
}
