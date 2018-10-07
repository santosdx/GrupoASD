package com.grupoAsd.activos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Al especificar la etiqueta @Controller en la clase, le decimos a spring que esto es un controlador.
@Controller
public class HolaController {


	@RequestMapping("irHola")
	public ModelAndView redireccion() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("hola");
		MV.addObject("mensaje", "soy un mensaje desde controler");
		return MV;
	}
	//El ModelAndView es un tipo de dato que va a permitir saber que vista se va a retornar al usuario.
}
