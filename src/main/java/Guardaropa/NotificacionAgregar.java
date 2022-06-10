package Guardaropa;

public class NotificacionAgregar extends NotificationUsuario{

  public NotificacionAgregar(String mensaje, Atuendo atuendo, Prenda prenda) {
    super(mensaje, atuendo, prenda);
  }

  @Override
  public void aceptar() {
    atuendo.agregarPrenda(this.prenda);
    this.condicion = "Aceptado";
  }
}
