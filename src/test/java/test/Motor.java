package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	 public void cambiarRegistro(int registroNuevo){
		 
		 this.registro = registroNuevo;
		 
		
	}
	 
	 public void asignarTipo(String tipoMotor) {
		 
		if(tipoMotor.equals("electrico")) {
			this.tipo=tipoMotor;
			
		}
		else if(tipoMotor.equals("gasolina")) {
			this.tipo=tipoMotor;
			
		}
		else {
			this.tipo = tipo;
		}
		 
	 }
	

}
