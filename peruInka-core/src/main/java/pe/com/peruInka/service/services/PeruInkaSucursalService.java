package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peruInka.service.util.Sucursal;

@Service("peruInkaSucursalService")
public class PeruInkaSucursalService {

	public static List<Sucursal> list = new ArrayList<Sucursal>();
	
	public String saveSucursal(Sucursal sucursal){
		String validate = "ok";
		String message="ID YA EXISTE";
		for (Sucursal objet : list) {
			if(objet.getId().compareTo(sucursal.getId())==0){
				validate = "ERROR";
				continue;
			}
		}
		if(validate.equals("ok")){
			list.add(sucursal);
			message="ok";
		}
		return message;
	}
	
	public List<Sucursal> findAllSucursal(){
		return list;
	}
	
	public void updateSucursal(Sucursal sucursalUpdate){
		List<Sucursal> listTemp = new ArrayList<Sucursal>();
		
		for (Sucursal sucursal : list) {
			if(sucursalUpdate.getId().compareTo(sucursal.getId())==0){
				listTemp.add(sucursalUpdate);
			}else{
				listTemp.add(sucursal);
			}
		}
		list = new ArrayList<Sucursal>();
		list.addAll(listTemp);

	}
	
	public Sucursal searchSucursal(Long id){
		Sucursal sucursalReturn = new Sucursal();
		for (Sucursal sucursal : list) {
			if(id.compareTo(sucursal.getId())==0){
				sucursalReturn = sucursal;
				continue;
			}
		}
		return sucursalReturn;
	}
	
	public void deleteSucursal(Long id){
		List<Sucursal> listTemp = new ArrayList<Sucursal>();
		
		for (Sucursal sucursal : list) {
			if(id.compareTo(sucursal.getId())!=0){
				listTemp.add(sucursal);
			}
		}
		list = new ArrayList<Sucursal>();
		list.addAll(listTemp);
	}
	
	public String getStatusMessage(String status) {
		if(status.equals("1")){
			return "ACTIVO";
		}else{
			return "INACTIVO";
		}
	}
	
	
}
