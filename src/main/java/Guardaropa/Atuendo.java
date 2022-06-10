package Guardaropa;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Atuendo {
  private List<Prenda> prendas;
  public Boolean esAtuendoCompleto () {
    return (this.prendas.stream().map(prenda -> prenda.getCategoria())
        .distinct().collect(Collectors.toList()).size() > 3) ? true : false;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }
  public Boolean atuendoAptoTemperatura(Integer temp){
    return this.prendas.stream().allMatch(prenda -> atuendoAptoTemperatura(temp));
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void eliminarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }
}
