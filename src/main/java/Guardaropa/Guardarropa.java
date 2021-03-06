package Guardaropa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Guardarropa {
  private TipoDeGuardaropa tipoDeGuardaropa;
  private List<Atuendo> atuendos;
  private Usuario duenio;

  public List<Atuendo> getAtuendosCompletos() {
    return this.atuendos.stream()
        .filter(atuendo -> atuendo.esAtuendoCompleto())
        .collect(Collectors.toList());
  }

  public List<Atuendo> atuendosParaTemperatura(Integer temp){
    return this.atuendos.stream().filter(atuendo -> atuendo.atuendoAptoTemperatura(temp))
        .collect(Collectors.toList());
  }

  public Usuario getDuenio() {
    return duenio;
  }

}
