package Guardaropa;

public class AtuendoUniforme {
  //Colegio colegio;
  //Rempesar si el tipo de prenda tiene a la categoria o al revez TODO
  PrendaSuperiorBorrador prendaSuperior;
  PrendaInferiorBorrador prendaInferior;
  PrendaCalzadoBorrador calzado;

  public AtuendoUniforme (PrendaSuperiorBorrador prendaSuperior, PrendaInferiorBorrador prendaInferior, PrendaCalzadoBorrador calzado) {
      prendaSuperior.crearPrenda();
      prendaInferior.crearPrenda();
      calzado.crearPrenda();
  }

  /*
  public void sugerirUniforme () {
    usuario.recibirSugerencia(this);
  }
  */
}
