package Guardaropa;

public abstract class NotificationUsuario {
  public String mensaje;
  public Atuendo atuendo;
  public Prenda prenda;
  public String condicion;
  public NotificationUsuario(String mensaje, Atuendo atuendo, Prenda prenda) {
    this.mensaje = mensaje;
    this.atuendo = atuendo;
    this.prenda = prenda;
  }

  public void notificar(Usuario usuario) {
    usuario.notificaciones.add(this);
  }

  public void aceptar() {};

  public void rechazar() {
    this.condicion = "Rechazado";
  };
}
