
public class HabitacionMantenimiento implements HabitacionEstado {

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion ha sido liberada");
		return new HabitacionOcupadaVacia();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

  	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

}
