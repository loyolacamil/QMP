package Guardaropa;

import Clima.IObtenerCondicion;
import Exceptions.DuenioException;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Usuario {

  private String email;
  private String password;
  private List<Guardarropa> guardarropas;
  public List<NotificationUsuario> notificaciones;
  private IObtenerCondicion condicion;
  //le damos al usuario la opcion de que interfaz elegir para obtener la condicion

  public List<Map<String, Object>> obtenerCondicionClimatica(String ciudad) {
    return this.condicion.getWeather(ciudad);
  }

  public List<Guardarropa> getGuardarropas() {
    return guardarropas;
  }

  public Atuendo sugerirAtuendoCompleto() {
    Random ramdomGet = new Random();
    Guardarropa guardarropa = this.guardarropas.get(ramdomGet.nextInt());
    return guardarropa.getAtuendosCompletos()
        .get(ramdomGet.nextInt(guardarropa.getAtuendosCompletos().size()));
  }

  //Estoy pensando en un traspaso de respondabilidades.
  public Atuendo sugerirAtuendoClimatico(String ciudad, Guardarropa guardarropa) {
    //TODO me falta entender como recibir la temperatura como un Int
    List<Map<String, Object>> condicionWeather = this.condicion.getWeather(ciudad);
    Integer temp = (Integer) condicionWeather.get(0).get("Temperature");
    Random ramdomGet = new Random();
    return this.getAtuendosSegunClima(temp, guardarropa)
        .get(ramdomGet.nextInt(this.getAtuendosSegunClima(temp, guardarropa).size()));
  }

  public List<Atuendo> getAtuendosSegunClima(Integer temp, Guardarropa guardarropa) {
    return guardarropa.atuendosParaTemperatura(temp);
  }

  public void sugerirAgregar (Guardarropa guardarropa, Atuendo atuendo, Prenda prenda) throws DuenioException {
    this.validarSugerencia(guardarropa);
    String mensaje = this.email + "ha sugerido agregar una prenda a tu Guardaropas";
    NotificationUsuario notificacion = new NotificacionAgregar(mensaje, atuendo, prenda);
    notificacion.notificar(guardarropa.getDuenio());
  }
  public void sugerirQuitar (Guardarropa guardarropa, Atuendo atuendo, Prenda prenda) throws DuenioException {
    this.validarSugerencia(guardarropa);
    String mensaje = this.email + "ha sugerido quitar una prenda a tu Guardaropas";
    NotificationUsuario notificacion = new NotificacionQuitar(mensaje, atuendo, prenda);
    notificacion.notificar(guardarropa.getDuenio());
  }

  public Boolean validarSugerencia(Guardarropa guardarropa) throws DuenioException {
    if (guardarropa.getDuenio() != this) {
      return true; }
    throw new DuenioException("Este guardaropas te pertenece");
  }

  public void EliminarNotificacionAceptadas() {
    this.notificaciones.removeAll(notificaciones.stream()
        .filter(notificationUsuario -> notificationUsuario.condicion.equals("Aceptado"))
        .collect(Collectors.toList()));
  }
}
