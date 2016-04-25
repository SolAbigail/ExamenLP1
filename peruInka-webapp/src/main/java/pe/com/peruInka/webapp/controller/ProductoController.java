package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.service.services.PeruInkaProductoService;
import pe.com.peruInka.service.util.Producto;

@Controller
public class ProductoController {

	@Autowired
	private PeruInkaProductoService peruInkaProductoService;

	@RequestMapping(value = "home/dashboardProducto", method = RequestMethod.GET)
	public String dashboardProductoDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listProducto", peruInkaProductoService.findAllProducto());
		return "home/dashboardProducto";
	}

	@RequestMapping(value = "home/frmProducto", method = RequestMethod.GET)
	public String frmProducto(Model model, HttpServletRequest request) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("opc", "new");
		return "home/frmProducto";
	}
	
	
	@RequestMapping(value = "home/saveProducto", method = RequestMethod.POST)
	public String saveProducto(Model model, HttpServletRequest request,@ModelAttribute("producto") Producto producto) {

		String opc = request.getParameter("opc");
		String message="";
		if(opc.equals("new")){
			message = peruInkaProductoService.saveProducto(producto);
		}else{
			peruInkaProductoService.updateProducto(producto);
		}
		
		if(message.equals("ok")){
			return "redirect:dashboardProducto";
		}else{
			model.addAttribute("producto", producto);
			model.addAttribute("opc", "new");
			model.addAttribute("message", message);
			return "home/frmProducto";
		}
	}
	
	@RequestMapping(value = "home/deleteProducto", method = RequestMethod.GET)
	public String deleteProducto(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		peruInkaProductoService.deleteProducto(id);
		return "redirect:dashboardProducto";
	}
	
	@RequestMapping(value = "home/editProducto", method = RequestMethod.GET)
	public String editProducto(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("cliente", peruInkaProductoService.searchProducto(id));
		model.addAttribute("opc", "update");
		return "home/frmProducto";
	}
	
	
	
}
