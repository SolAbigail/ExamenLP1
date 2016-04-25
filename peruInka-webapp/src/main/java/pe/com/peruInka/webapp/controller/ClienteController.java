package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.service.services.PeruInkaClienteService;
import pe.com.peruInka.service.util.Cliente;

@Controller
public class ClienteController {

	@Autowired
	private PeruInkaClienteService peruInkaClienteService;

	@RequestMapping(value = "home/dashboardCliente", method = RequestMethod.GET)
	public String dashboardClienteDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listCliente", peruInkaClienteService.findAllCliente());
		return "home/dashboardCliente";
	}

	@RequestMapping(value = "home/frmCliente", method = RequestMethod.GET)
	public String frmCliente(Model model, HttpServletRequest request) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("opc", "new");
		return "home/frmCliente";
	}
	
	
	@RequestMapping(value = "home/saveCliente", method = RequestMethod.POST)
	public String saveCliente(Model model, HttpServletRequest request,@ModelAttribute("cliente") Cliente cliente) {

		String opc = request.getParameter("opc");
		String message="";
		if(opc.equals("new")){
			message = peruInkaClienteService.saveCliente(cliente);
		}else{
			peruInkaClienteService.updateCliente(cliente);
		}
		
		if(message.equals("ok")){
			return "redirect:dashboardCliente";
		}else{
			model.addAttribute("cliente", cliente);
			model.addAttribute("opc", "new");
			model.addAttribute("message", message);
			return "home/frmCliente";
		}
	}
	
	@RequestMapping(value = "home/deleteCliente", method = RequestMethod.GET)
	public String deleteCliente(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		peruInkaClienteService.deleteCliente(id);
		return "redirect:dashboardCliente";
	}
	
	@RequestMapping(value = "home/editCliente", method = RequestMethod.GET)
	public String editCliente(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("cliente", peruInkaClienteService.searchCliente(id));
		model.addAttribute("opc", "update");
		return "home/frmCliente";
	}
	
	
	
}
