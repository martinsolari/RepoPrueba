Class Usuario{

	private String nombre;
	private int cedula;
	private String contraseña;
	private int edad;
	private int cantidadDeHijos;
	private float saldo;


	public void setCedula(int c){
		cedula = c;
	}

	public void setContraseña(String c){
		contraseña = c;
	}

	public void setEdad(int e){
		edad = e;
	}

	public void setCantidadDeHijos(int c){
		cantidadDeHijos = c;
	}

	public void setSaldo(float s){
		saldo = s;
	}

	public String getNombre(){
		return nombre;
	}

	public int getCedula(){
		return cedula;
	}

	public String getContraseña(){
		return contraseña;
	}

	public int getEdad(){
		return edad;
	}

	public int getCantidadDeHijos(){
		return cantidadDeHijos;
	}

	public float getSaldo(){
		return saldo;
	}
}
