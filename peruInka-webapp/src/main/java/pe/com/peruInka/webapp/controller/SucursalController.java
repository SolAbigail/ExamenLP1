package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.service.services.PeruInkaSucursalService;
import pe.com.peruInka.service.util.Sucursal;

@Controller
public class SucursalController {

	@Autowired
	private PeruInkaSucursalService peruInkaSucursalService;

	@RequestMapping(value = "home/dashboardSucursal", method = RequestMethod.GET)
	public String dashboardSucursalDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listSucursal", peruInkaSucursalService.findAllSucursal());
		return "home/dashboardSucursal";
	}
	

	@RequestMapping(value = "home/frmSucursal", method = RequestMethod.GET)
	public String frmSucursal(Model model, HttpServletRequest request) {
		model.addAttribute("sucursal", new Sucursal());
		model.addAttribute("opc", "new");
		return "home/frmSucursal";
	}
	
	
	@RequestMapping(value = "home/saveSucursal", method = RequestMethod.POST)
	public String saveSucursal(Model model, HttpServletRequest request,@ModelAttribute("sucursal") Sucursal sucursal) {
		String opc = request.getParameter("opc");
		String message="";
		if(opc.equals("new")){
			message = peruInkaSucursalService.saveSucursal(sucursal);
		}else{
			peruInkaSucursalService.updateSucursal(sucursal);
		}
		
		if(message.equals("ok")){
			return "redirect:dashboardSucursal";
		}else{
			model.addAttribute("sucursal", sucursal);
			model.addAttribute("opc", "new");
			model.addAttribute("message", message);
			return "home/frmSucursal";
		}
	}
	
	@RequestMapping(value = "home/deleteSucursal", method = RequestMethod.GET)
	public String deleteSucursal(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		peruInkaSucursalService.deleteSucursal(id);
		return "redirect:dashboardSucursal";
	}
	
	@RequestMapping(value = "home/editSucursal", method = RequestMethod.GET)
	public String editSucursal(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("sucursal", peruInkaSucursalService.searchSucursal(id));
		model.addAttribute("opc", "update");
		return "home/frmSucursal";
	}
	

}
