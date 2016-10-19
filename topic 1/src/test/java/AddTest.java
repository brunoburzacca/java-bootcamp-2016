import static org.junit.Assert.*;
import org.junit.Test;

public class AddTest {

   @Test
   public void sumaPositivos() {
      System.out.println("Sumando dos números positivos ...");
       Add S = new Add(2, 3);
       assertTrue(S.getAdd() == 5);
   }

   @Test
   public void sumaNegativos() {
       System.out.println("Sumando dos números negativos ...");
       Add S = new Add(-2, -3);
       assertTrue(S.getAdd() == -5);
   }

   @Test
   public void sumaPositivoNegativo() {
       System.out.println("Sumando un número positivo y un número negativo ...");
       Add S = new Add(2, -3);
       assertTrue(S.getAdd() == -1);
   }
} 
