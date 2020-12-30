package ejercicioTraineeOnready;

public class Automovil extends Vehiculo{

	private int cantidadPuertas;

	public Automovil(String marca, String modelo, int cantidadPuertas, double precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.cantidadPuertas = cantidadPuertas;
	}

	public Automovil() {
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	public String toString() {
		return "Marca: "+this.getMarca()+" // " +"Modelo: " +this.getModelo()+" // " +"Puertas: "
				+this.getCantidadPuertas()+" // " +"Precio: $" +this.getPrecio();
	}

}
