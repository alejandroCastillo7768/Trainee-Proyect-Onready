package ejercicioTraineeOnready;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Vehiculo> vehiculoLista = new ArrayList<Vehiculo>();
		String vehiculoContieneLetra = "20";

		vehiculoLista.add(new Automovil("Peugeot", "206", 4, 200000.00));
		vehiculoLista.add(new Motocicleta("Honda", "Titan", "125cc", 60000.00));
		vehiculoLista.add(new Automovil("Peugeot", "208", 5, 250000.00));
		vehiculoLista.add(new Motocicleta("Yamaha", "YBR", "160cc", 80500.50));
		vehiculoLista.add(new Automovil("Peugeot", "306", 4, 320000.00));
		vehiculoLista.add(new Automovil("Volkswagen", "Vento", 5, 350000.00));
		vehiculoLista.add(new Motocicleta("Motomel", "Go Vintage", "110cc", 10500.50));
		vehiculoLista.add(new Motocicleta("Susuki", "AX", "200cc", 200000.00));
		
		for(int i = 0; i < vehiculoLista.size(); i++) System.out.println(vehiculoLista.get(i).toString());

		System.out.println("=============================");
		
		Vehiculo.calcularPrecio(vehiculoLista);
		Vehiculo.contieneLetra(vehiculoLista, vehiculoContieneLetra);
		
		System.out.println("=============================");
		
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
		Vehiculo.ordenarVehiculos(vehiculoLista);
		
	}


}
