package Guardaropa;

import Clima.IObtenerCondicion;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Usuario {

  private String email;
  private String password;
  private Guardarropa guardarropa;
  private IObtenerCondicion condicion;
  //le damos al usuario la opcion de que interfaz elegir para obtener la condicion

  public List<Map<String,Object>> obtenerCondicionClimatica(String ciudad){
    return this.condicion.getWeather(ciudad);
  }

  public Atuendo sugerirAtuendoCompleto(){
    Random ramdomGet = new Random();
    return this.guardarropa.getAtuendosCompletos()
        .get(ramdomGet.nextInt(guardarropa.getAtuendosCompletos().size()));
  }

  public Atuendo sugerirAtuendoClimatico(String ciudad){
    //TODO me falta entender como recibir la temperatura como un Int
    List<Map<String, Object>> condicionWeather = this.condicion.getWeather(ciudad);
    Integer temp = (Integer) condicionWeather.get(0).get("Temperature");
    Random ramdomGet = new Random();
    return this.getAtuendosSegunClima(temp)
        .get(ramdomGet.nextInt(this.getAtuendosSegunClima(temp).size()));
  }

  public List<Atuendo> getAtuendosSegunClima(Integer temp) {
    return this.guardarropa.atuendosParaTemperatura(temp);
  }


}
