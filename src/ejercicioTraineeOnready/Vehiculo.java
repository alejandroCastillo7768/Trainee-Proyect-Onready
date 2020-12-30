package ejercicioTraineeOnready;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Vehiculo {

	public String marca;
	public String modelo;
	public double precio;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static void calcularPrecio(List<Vehiculo> vehiculoLista) {
		double max = 0;
		String marcaMax = null;
		String modeloMax = null;

		for (int k = 0; k < vehiculoLista.size(); k++) {
			if (vehiculoLista.get(k).getPrecio() > max) {
				max = vehiculoLista.get(k).getPrecio();
				marcaMax = vehiculoLista.get(k).getMarca();
				modeloMax = vehiculoLista.get(k).getModelo();
			}
		}
		double min = max;
		String marcaMin = null;
		String modeloMin = null;

		for (int j = 0; j < vehiculoLista.size(); j++) {
			if (vehiculoLista.get(j).getPrecio() < min) {
				min = vehiculoLista.get(j).getPrecio();
				marcaMin = vehiculoLista.get(j).getMarca();
				modeloMin = vehiculoLista.get(j).getModelo();
			}
		}
		System.out.println("Vehículo más caro: "+marcaMax +" "+modeloMax);
		System.out.println("Vehículo más barato: "+marcaMin +" "+modeloMin);
	}

	public static void contieneLetra(List<Vehiculo> vehiculoLista, String vehiculoContieneLetra) {
		boolean aux = false;

		for(int l = 0; l < vehiculoLista.size(); l++) {

			aux = vehiculoLista.get(l).getModelo().contains(vehiculoContieneLetra);
			if(aux) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘"+vehiculoContieneLetra+"’: "+vehiculoLista.get(l).getMarca()
						+" "+vehiculoLista.get(l).getModelo()+" $"+ vehiculoLista.get(l).getPrecio());
			}
		}
	}

	public static Comparator<Vehiculo> comparatorPrecio = new Comparator<Vehiculo>() {

		public int compare(Vehiculo v1, Vehiculo v2) {
			Double vehiculoPrecio1 = v1.getPrecio();
			Double vehiculoPrecio2 = v2.getPrecio();

			return vehiculoPrecio2.compareTo(vehiculoPrecio1); 
		}
	};

	public static void ordenarVehiculos(List<Vehiculo> vehiculoLista) {

		Collections.sort(vehiculoLista, Vehiculo.comparatorPrecio);
		for(Vehiculo str: vehiculoLista) System.out.println(str.getMarca()+" "+str.getModelo());
	}
}
