import Guardaropa.*;
import Guardaropa.PrendaCaracteristicas.Categoria;
import Guardaropa.PrendaCaracteristicas.Material;
import Guardaropa.PrendaCaracteristicas.TipodePrenda;
import Guardaropa.PrendaCaracteristicas.Trama;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

public class PrendaTest {
  Prenda shortJean = new Prenda(TipodePrenda.SHORT, Material.JEAN, Color.BLUE,null, Trama.LISA);
  Prenda tacones = new Prenda(TipodePrenda.TACOS,Material.CHAROL,Color.BLACK,null,null);

  @Test
  public void CategoriaPrendaParteInferior(){
    assertEquals(shortJean.getCategoria(), Categoria.PARTE_INFERIOR);
  }
  @Test
  public void CategoriaPrendaCalzado(){
    assertEquals(tacones.getCategoria(),Categoria.CALZADO);
  }
}
