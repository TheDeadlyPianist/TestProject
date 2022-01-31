package utils

import play.api.i18n.I18nSupport
import play.api.mvc.{BaseController, ControllerComponents}

class FrontendController(val controllerComponents: ControllerComponents) extends BaseController with I18nSupport
