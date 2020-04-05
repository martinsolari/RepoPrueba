import Usuarios;
class FuncionesUsuario{

	public float calculaImpuestos(Usuario x){
		int cant;
		if(x.getEdad()<18) cant = 0.0;
		if(x.getEdad()<=30 && x.getEdad()>=18) cant = 2000.0;
		if(x.getEdad()>=30 && x.getEdad()<=65) cant = 7000.0;
		if(x.getEdad()>65) cant = 2000.0;
		int aux = cant-x.getCantidadDeHijos()*cant*0.03;
		while(aux > cant/2){
			aux -= cant*0.03;
		}
		return aux;
	}

}
