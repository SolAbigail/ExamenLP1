package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peruInka.service.util.Producto;

@Service("peruInkaProductoService")
public class PeruInkaProductoService {

	public static List<Producto> list = new ArrayList<Producto>();
	
	public String saveProducto(Producto producto){
		String validate = "ok";
		String message="ID YA EXISTE";
		for (Producto objet : list) {
			if(objet.getId().compareTo(producto.getId())==0){
				validate = "ERROR";
				continue;
			}
		}
		if(validate.equals("ok")){
			list.add(producto);
			message="ok";
		}
		return message;
	}
	
	public List<Producto> findAllProducto(){
		return list;
	}
	
	public void updateProducto(Producto productoUpdate){
		List<Producto> listTemp = new ArrayList<Producto>();
		
		for (Producto producto : list) {
			if(productoUpdate.getId().compareTo(producto.getId())==0){
				listTemp.add(productoUpdate);
			}else{
				listTemp.add(producto);
			}
		}
		list = new ArrayList<Producto>();
		list.addAll(listTemp);

	}
	
	public Producto searchProducto(Long id){
		Producto productoReturn = new Producto();
		for (Producto producto : list) {
			if(id.compareTo(producto.getId())==0){
				productoReturn = producto;
				continue;
			}
		}
		return productoReturn;
	}
	
	public void deleteProducto(Long id){
		List<Producto> listTemp = new ArrayList<Producto>();
		
		for (Producto producto : list) {
			if(id.compareTo(producto.getId())!=0){
				listTemp.add(producto);
			}
		}
		list = new ArrayList<Producto>();
		list.addAll(listTemp);
	}
}