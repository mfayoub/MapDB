package org.mapdb;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    int var1 = org.mapdb.DataIO.longHash(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    org.mapdb.Fun.Function1 var1 = org.mapdb.Fun.extractNoTransform();
    org.mapdb.Fun.Function1 var2 = org.mapdb.Fun.extractNoTransform();
    byte[] var10 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.StoreDirect var12 = new org.mapdb.StoreDirect("hi!", var1, var2, true, false, 0, false, 100L, true, true, var10, 0);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    org.mapdb.Fun.Function1 var1 = org.mapdb.Fun.extractNoTransform();
    org.mapdb.Fun.Function1 var2 = org.mapdb.Fun.extractNoTransform();
    byte[] var12 = new byte[] { (byte)10, (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.StoreDirect var14 = new org.mapdb.StoreDirect("hi!", var1, var2, false, true, 1, true, 100L, true, true, var12, (-1));
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    byte[] var3 = new byte[] { (byte)100, (byte)1, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var5 = new org.mapdb.DataIO.DataInputByteArray(var3, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var5.readDouble();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    byte[] var3 = new byte[] { (byte)100, (byte)1, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var5 = new org.mapdb.DataIO.DataInputByteArray(var3, (-1));
    byte[] var7 = new byte[] { (byte)0};
    byte[] var8 = org.mapdb.EncryptionXTEA.getHash(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.readFully(var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }
}
