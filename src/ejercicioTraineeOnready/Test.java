package ejercicioTraineeOnready;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Vehiculo> vehiculoLista = new ArrayList<Vehiculo>();
		String contiene = "208";

		vehiculoLista.add(new Automovil("Peugeot", "206", 4, 200000.00));
		vehiculoLista.add(new Motocicleta("Honda", "Titan", "125cc", 60000.00));
		vehiculoLista.add(new Automovil("Peugeot", "208", 5, 250000.00));
		vehiculoLista.add(new Motocicleta("Yamaha", "YBR", "160cc", 80500.50));

		for(int i = 0; i < vehiculoLista.size(); i++) System.out.println(vehiculoLista.get(i).toString());

		System.out.println("=============================");
		Vehiculo.calcularPrecio(vehiculoLista);
		Vehiculo.contieneLetra(vehiculoLista, contiene);
		System.out.println("=============================");
		Vehiculo.ordenarVehiculos(vehiculoLista);
		
		
	}


}
