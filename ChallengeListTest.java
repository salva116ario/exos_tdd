import java.util.Arrays;

public class ChallengeListTest{

  /**
  * Les tests sont à écrire ici.
  * Il peut y avoir plusieurs assert pour chaque methode testée.
  */


  public static void testMoyenne(){
    // TODO @B
      assertEquals("Moyenne de 10 et 20 = 15", 15, ChallengeList.moyenne(10,20));
      assertEquals("Moyenne de 0 et 0 = 0", 0, ChallengeList.moyenne(0,0));
      assertEquals("Moyenne de -10 et 10 = 0", 0, ChallengeList.moyenne(-10,10));
      assertEquals("Moyenne de -100 et -50 = -75", -75, ChallengeList.moyenne(-100,-50));
  }

  public static void testPerimetreCarre(){
    // TODO @A
    assertEquals("Test périmètre 4", 16, ChallengeList.perimetreCarre(4));
    assertEquals("Test périmètre 0", 0, ChallengeList.perimetreCarre(0));

  }

  public static void testCommenceFini(){
    // TODO @B
      assertTrue("PALUPA : commence et finit par PA", ChallengeList.commenceFini("PALUPA"));
      assertFalse("LUPAPA : commence par LU, finit par PA", ChallengeList.commenceFini("LUPAPA"));
  }

  public static void testNonMonotone(){
    // TODO @A
    assertFalse("Test Non Monotone AAAAAA -> FALSE", ChallengeList.nonMonotone("AAAAAA"));
    assertTrue("Test Non Monotone AACAAACA -> TRUE", ChallengeList.nonMonotone("AACAAACA"));

  }

  public static void testTarif(){
    // TODO @B
    assertEquals("Test tarif : 2 ans", "gratuit", ChallengeList.tarif(2));
    assertEquals("Test tarif : -6 ans", "erreur", ChallengeList.tarif(-6));
    assertEquals("Test tarif : 11 ans", "reduit", ChallengeList.tarif(11));
    assertEquals("Test tarif : 43 ans", "plein", ChallengeList.tarif(43));


  }

  public static void testCaGele(){
    // TODO @A
      assertEquals("temp = - 777", "erreur", ChallengeList.caGele(-777));
      assertEquals("temp = - 50", "ça gèle", ChallengeList.caGele(-50));
      assertEquals("temp = 5", "ça caille", ChallengeList.caGele(5));
      assertEquals("temp = 42", "RAS", ChallengeList.caGele(42));
      assertEquals("temp = 91", "ça bouille", ChallengeList.caGele(91));
  }

  public static void testFiltreShort(){
    // TODO @B
      String[] test = {"ARBRE","SOLEIL","a","b","FROID","cc"};
      String[] res = { "ARBRE","SOLEIL","FROID" };
      assertEquals("ARBRE,SOLEIL,a,b,FROID,cc", res, ChallengeList.filtreShort(test));
  }

  public static void testFiltreLetter(){
    // TODO @A
      String[] test = {"ARBRE","ABRIBUS","BRUTE","CACHALOT"};
      String[] res = {"CACHALOT"};
      assertEquals("Arbre,abribus,brute,cachalot : mot qui commence par C", res, ChallengeList.filtreLetter(test,'C'));


      }




  /**
  * un exemple de test
  */
  public static void testSquareDigits(){
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.squareDigits(4));
    assertEquals("SquareDigits plusieurs chiffres", 811181, ChallengeList.squareDigits(9119));
  }


  /****************************************************************************
  * NE PAS TOUCHER CE QUI SUIT
  **/
  public static void main(String[] args){
    testMoyenne();
    testPerimetreCarre();
    testCommenceFini();
    testNonMonotone();
    testSquareDigits();
    testTarif();
    testCaGele();
    testFiltreShort();
    testFiltreLetter();
  }

  public static void assertEquals(String message, String[] expected, String[] res){
    if (java.util.Arrays.deepEquals(expected, res)) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+Arrays.toString(expected)+", res : "+Arrays.toString(res)+")");
    }
  }

  public static void assertEquals(String message, String expected, String res){
    if (res.equals(expected)) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, double expected, double res){
    if (Math.abs(expected-res) < 0.0001) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, int expected, int res){
    if (expected == res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertTrue(String message, boolean res){
    if (res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (res : "+res+")");
    }
  }

  public static void assertFalse(String message, boolean res){
    assertTrue(message, !res);
  }
}
