package Guardaropa;

public class NotificacionQuitar extends NotificationUsuario {

  public NotificacionQuitar(String mensaje, Atuendo atuendo, Prenda prenda) {
    super(mensaje, atuendo , prenda);
  }

  @Override
  public void aceptar() {
    this.atuendo.eliminarPrenda(prenda);
    this.condicion = "Aceptado";
  }
}
