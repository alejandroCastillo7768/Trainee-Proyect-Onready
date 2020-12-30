package ejercicioTraineeOnready;

public class Motocicleta extends Vehiculo{

	private String cilindrada;

	public Motocicleta(String marca, String modelo, String cilindrada, double precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}

	public Motocicleta() {
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String toString() {
		return "Marca: "+this.getMarca()+" // " +"Modelo: " +this.getModelo()+" // " +"Cilindrada: "
				+this.getCilindrada()+" // " +"Precio: $" +this.getPrecio();
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
