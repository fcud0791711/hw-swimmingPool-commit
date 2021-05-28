/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo2.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MessageUtilsTest {
    
  @Test
   void test01() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(-1,s1.swimming(5,2,true,false,6));
  }
  
  @Test
  void test02() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(100, s1.swimming(2, 9, true, true,12));
  }
  
  @Test
  void test03(){
    swimmingPool s1 = new swimmingPool();
    assertEquals(-1,s1.swimming(6, 30 ,false,false,23));
  }
  
  @Test
  void test04() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(125,s1.swimming(6, 65 ,false,true,12));
  }
  @Test
  void test05() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(-1,s1.swimming(4, 90 ,false,true,11));
  }
  
  /*弱涵蓋結束*/
  @Test
  void test06() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(200,s1.swimming(5, 30 ,false,false,12));
  }
  @Test
  void test07() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(140,s1.swimming(5, 30 ,true,false,12));
  }
  
  @Test
  void test08() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(160,s1.swimming(5, 30 ,false,false,6));
  }

  @Test
  void test09() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(160,s1.swimming(5, 65 ,false,false,12));
  }
  
  @Test
  void test10() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(160,s1.swimming(5, 7 ,false,false,12));
  }

  @Test
  void test11() throws Exception {
    swimmingPool s1 = new swimmingPool();
    assertEquals(-1,s1.swimming(5,7,true,false,4));
  }

}
