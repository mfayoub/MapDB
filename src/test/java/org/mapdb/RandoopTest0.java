package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    org.mapdb.Fun.Function1 var2 = org.mapdb.Volume.memoryFactory(false, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    java.util.Comparator[] var0 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var1 = new org.mapdb.Fun.ArrayComparator(var0);
    java.util.Iterator[] var3 = new java.util.Iterator[] { };
    java.util.Iterator var4 = org.mapdb.Pump.merge(var3);
    java.util.Iterator var5 = org.mapdb.Pump.sort((java.util.Comparator)var1, true, var3);
    java.util.Comparator[] var6 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var7 = new org.mapdb.Fun.ArrayComparator(var6);
    java.util.Iterator[] var9 = new java.util.Iterator[] { };
    java.util.Iterator var10 = org.mapdb.Pump.merge(var9);
    java.util.Iterator var11 = org.mapdb.Pump.sort((java.util.Comparator)var7, true, var9);
    java.util.Comparator var12 = var1.thenComparing((java.util.Comparator)var7);
    boolean var14 = var1.equals((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    org.mapdb.Pump var0 = new org.mapdb.Pump();

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    org.mapdb.DBException.Code[] var0 = org.mapdb.DBException.Code.values();
    org.mapdb.Fun.Pair var2 = new org.mapdb.Fun.Pair((java.lang.Object)var0, (java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    int var1 = org.mapdb.DataIO.intHash(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    org.mapdb.Fun.Function1 var0 = org.mapdb.Fun.extractKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var4 = var3.readLong();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    int var1 = org.mapdb.DataIO.intHash(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    org.mapdb.CompressLZF var0 = new org.mapdb.CompressLZF();
    byte[] var3 = new byte[] { (byte)0, (byte)100};
    byte[] var6 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.compress(var3, 0, var6, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    int var2 = org.mapdb.Fun.compareLong(1L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    org.mapdb.CompressLZF var0 = new org.mapdb.CompressLZF();
    byte[] var3 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var4 = new org.mapdb.DataIO.DataInputByteBuffer(var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.expand(var3, 1, var8, (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var2 = var0.cacheSize(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.DBMaker var4 = var2.freeSpaceReclaimQ((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.strictDBGet();
    boolean var3 = org.mapdb.Fun.eq((java.lang.Object)var1, (java.lang.Object)1.0d);
    java.util.Iterator[] var4 = new java.util.Iterator[] { };
    java.util.Iterator var5 = org.mapdb.Pump.merge(var4);
    org.mapdb.Fun.Pair var6 = new org.mapdb.Fun.Pair((java.lang.Object)1.0d, (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    int var5 = var3.skipBytes((-1));
    var3.setPos(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var8 = var3.readChar();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.LongConcurrentLRUMap var4 = new org.mapdb.LongConcurrentLRUMap(10, 10, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    org.mapdb.Volume.MemoryVol var2 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var3 = var2.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.putInt(10L, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    int var5 = var3.skipBytes((-1));
    int[] var8 = new int[] { (-1), (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.BTreeKeySerializer.CharArrayKeys var10 = new org.mapdb.BTreeKeySerializer.CharArrayKeys((java.io.DataInput)var3, var8, 0);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    int var5 = var3.skipBytes((-1));
    var3.setPos(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var8 = var3.readFloat();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    int var2 = org.mapdb.Fun.compareLong(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0._newMemoryDirectDB();
    org.mapdb.DBMaker var2 = var0._newMemoryDirectDB();
    org.mapdb.DBMaker var3 = var0.asyncWriteEnable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    org.mapdb.LongHashMap var0 = new org.mapdb.LongHashMap();
    var0.clear();

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.LongHashMap var1 = new org.mapdb.LongHashMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    int var5 = var3.skipBytes((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short var6 = var3.readShort();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    int var5 = var3.skipBytes((-1));
    int[] var8 = new int[] { 0, (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.BTreeKeySerializer.CharArrayKeys var10 = new org.mapdb.BTreeKeySerializer.CharArrayKeys((java.io.DataInput)var3, var8, 100);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    org.mapdb.LongHashMap var1 = new org.mapdb.LongHashMap(100);
    java.lang.Object var3 = var1.get(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    int var2 = org.mapdb.Fun.compareLong((-1L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    int var1 = org.mapdb.DataIO.nextPowTwo(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 128);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0._newMemoryDirectDB();
    org.mapdb.DBMaker var2 = var0._newMemoryDirectDB();
    org.mapdb.DBMaker var3 = var2.snapshotEnable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var4 = new org.mapdb.DataIO.DataInputByteArray(var2, 0);
    int var6 = var4.skipBytes(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var4.readLine();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.mmapFileEnableIfSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    int var2 = org.mapdb.Fun.compareLong(10L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.HTreeMap var3 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.Bind.mapInverse((org.mapdb.Bind.MapWithModificationListener)var1, (java.util.Map)var3);
    long var5 = var3.getMaxExpireTime();
    byte[] var8 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var10 = new org.mapdb.DataIO.DataInputByteArray(var8, 0);
    java.lang.Object var11 = var3.remove((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    org.mapdb.Volume.MemoryVol var2 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var3 = var2.isEmpty();
    boolean var4 = var2.isEmpty();
    var2.ensureAvailable(0L);
    var2.deleteFile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var9 = var2.getSixLong((-1L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    java.util.Comparator[] var0 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var1 = new org.mapdb.Fun.ArrayComparator(var0);
    java.util.Comparator[] var2 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var3 = new org.mapdb.Fun.ArrayComparator(var2);
    java.util.Comparator var4 = var1.thenComparing((java.util.Comparator)var3);
    java.util.Comparator[] var5 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var6 = new org.mapdb.Fun.ArrayComparator(var5);
    java.util.Iterator[] var8 = new java.util.Iterator[] { };
    java.util.Iterator var9 = org.mapdb.Pump.merge(var8);
    java.util.Iterator var10 = org.mapdb.Pump.sort((java.util.Comparator)var6, true, var8);
    java.util.Comparator[] var11 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var12 = new org.mapdb.Fun.ArrayComparator(var11);
    int var13 = var1.compare((java.lang.Object[])var8, (java.lang.Object[])var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    org.mapdb.Fun.Pair var13 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    boolean var15 = var13.equals((java.lang.Object)(byte)1);
    java.lang.Object var16 = var0.remove((java.lang.Object)var15);
    java.lang.Object var19 = var0.put((java.lang.Object)10.0f, (java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    java.util.Collection var2 = var1.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var3 = var1.snapshot();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    int var5 = var3.skipBytes((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var3.readBoolean();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newHeapDB();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0._newMemoryDirectDB();
    org.mapdb.DBMaker var2 = var0.commitFileSyncDisable();
    org.mapdb.DBMaker var3 = var0.asyncWriteEnable();
    org.mapdb.DBMaker var5 = var3.asyncWriteFlushDelay(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    org.mapdb.DBMaker var1 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var2 = var1._newMemoryDirectDB();
    org.mapdb.DBMaker var3 = var1._newMemoryDirectDB();
    org.mapdb.DBMaker var4 = var1.cacheWeakRefEnable();
    java.util.concurrent.ConcurrentNavigableMap var5 = var0.tailMap((java.lang.Object)var1);
    org.mapdb.DBMaker var6 = var1.cacheHardRefEnable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    java.util.Collection var2 = var1.values();
    org.mapdb.Volume.MemoryVol var5 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    boolean var8 = var1.containsValue((java.lang.Object)var5);
    var1.clear();
    var1.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    org.mapdb.HTreeMap var0 = org.mapdb.DBMaker.newTempHashMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Map.Entry var1 = var0.firstEntry();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    org.mapdb.LongConcurrentHashMap var0 = new org.mapdb.LongConcurrentHashMap();
    var0.clear();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    boolean var9 = var0.containsValue((java.lang.Object)var6);
    org.mapdb.DBMaker var11 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var13 = var11.cacheSize(100);
    org.mapdb.DBMaker var14 = var13.closeOnJvmShutdown();
    java.lang.Object var15 = var0.replace((-1L), (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    java.util.Iterator[] var0 = new java.util.Iterator[] { };
    java.util.Iterator var1 = org.mapdb.Pump.merge(var0);
    java.util.Iterator var2 = org.mapdb.Pump.merge(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    byte[] var13 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var14 = new org.mapdb.DataIO.DataInputByteBuffer(var13);
    int var16 = var14.skipBytes((-1));
    var14.setPos(10);
    java.util.Map.Entry var19 = var0.ceilingEntry((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var20 = var14.readInt();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.cacheLRUEnable();
    org.mapdb.DBMaker var2 = var1.transactionDisable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    org.mapdb.Fun.Pair var13 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    boolean var15 = var13.equals((java.lang.Object)(byte)1);
    java.lang.Object var16 = var0.remove((java.lang.Object)var15);
    org.mapdb.LongConcurrentHashMap var17 = new org.mapdb.LongConcurrentHashMap();
    var17.clear();
    org.mapdb.Fun.Pair var21 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var22 = var21.toString();
    org.mapdb.LongHashMap var23 = new org.mapdb.LongHashMap();
    java.util.Iterator var24 = var23.valuesIterator();
    boolean var25 = var21.equals((java.lang.Object)var23);
    boolean var26 = var17.containsValue((java.lang.Object)var23);
    java.util.Map.Entry var27 = var0.higherEntry((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Pair[0, hi!]"+ "'", var22.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    byte[] var13 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var14 = new org.mapdb.DataIO.DataInputByteBuffer(var13);
    int var16 = var14.skipBytes((-1));
    var14.setPos(10);
    java.util.Map.Entry var19 = var0.ceilingEntry((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var14.readLine();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var3.readUTF();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var4 = new org.mapdb.DataIO.DataInputByteArray(var2, 0);
    int var6 = var4.skipBytes(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var4.readUnsignedShort();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    byte var4 = var3.readByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.readDouble();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)10);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    org.mapdb.DBMaker var1 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var2 = var1.strictDBGet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.concurrent.ConcurrentNavigableMap var6 = var0.subMap((java.lang.Object)var1, false, (java.lang.Object)false, true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    org.mapdb.Fun.Pair var13 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    boolean var15 = var13.equals((java.lang.Object)(byte)1);
    java.lang.Object var16 = var0.remove((java.lang.Object)var15);
    org.mapdb.BTreeMap var17 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var18 = var17.values();
    org.mapdb.Fun.Pair var21 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var22 = var21.toString();
    org.mapdb.LongHashMap var23 = new org.mapdb.LongHashMap();
    java.util.Iterator var24 = var23.valuesIterator();
    boolean var25 = var21.equals((java.lang.Object)var23);
    java.lang.Object var26 = var17.floorKey((java.lang.Object)var25);
    java.util.Map.Entry var27 = var17.firstEntry();
    var17.checkStructure();
    boolean var29 = var0.containsKey((java.lang.Object)var17);
    java.util.Map.Entry var30 = var17.firstEntry();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Pair[0, hi!]"+ "'", var22.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    org.mapdb.Fun.Pair var13 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    boolean var15 = var13.equals((java.lang.Object)(byte)1);
    java.lang.Object var16 = var0.remove((java.lang.Object)var15);
    org.mapdb.BTreeMap var17 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var18 = var17.values();
    org.mapdb.Fun.Pair var21 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var22 = var21.toString();
    org.mapdb.LongHashMap var23 = new org.mapdb.LongHashMap();
    java.util.Iterator var24 = var23.valuesIterator();
    boolean var25 = var21.equals((java.lang.Object)var23);
    java.lang.Object var26 = var17.floorKey((java.lang.Object)var25);
    java.util.Map.Entry var27 = var17.firstEntry();
    var17.checkStructure();
    boolean var29 = var0.containsKey((java.lang.Object)var17);
    org.mapdb.Engine var30 = var0.getEngine();
    org.mapdb.Atomic.Boolean var32 = new org.mapdb.Atomic.Boolean(var30, (-1L));
    org.mapdb.Atomic.Integer var34 = new org.mapdb.Atomic.Integer(var30, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Pair[0, hi!]"+ "'", var22.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.Engine var2 = var1.getEngine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    org.mapdb.Fun.Pair var13 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    boolean var15 = var13.equals((java.lang.Object)(byte)1);
    java.lang.Object var16 = var0.remove((java.lang.Object)var15);
    org.mapdb.BTreeMap var17 = org.mapdb.DBMaker.newTempTreeMap();
    org.mapdb.DBMaker var18 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var19 = var18._newMemoryDirectDB();
    org.mapdb.DBMaker var20 = var18._newMemoryDirectDB();
    org.mapdb.DBMaker var21 = var18.cacheWeakRefEnable();
    java.util.concurrent.ConcurrentNavigableMap var22 = var17.tailMap((java.lang.Object)var18);
    org.mapdb.DBMaker var23 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var24 = var23._newMemoryDirectDB();
    org.mapdb.DBMaker var25 = var23._newMemoryDirectDB();
    java.util.concurrent.ConcurrentNavigableMap var26 = var17.tailMap((java.lang.Object)var23);
    java.util.concurrent.ConcurrentNavigableMap var27 = var0.headMap((java.lang.Object)var17);
    java.util.concurrent.ConcurrentNavigableMap var28 = var17.descendingMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var4 = new org.mapdb.DataIO.DataInputByteArray(var2, 0);
    org.mapdb.DataIO.DataInputToStream var5 = new org.mapdb.DataIO.DataInputToStream((java.io.DataInput)var4);
    boolean var6 = var5.markSupported();
    int var7 = var5.read();
    boolean var8 = var5.markSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    java.util.NavigableSet var0 = org.mapdb.DBMaker.newTempTreeSet();
    java.util.Spliterator var1 = var0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    org.mapdb.CompressLZF var0 = new org.mapdb.CompressLZF();
    byte[] var3 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var5 = new org.mapdb.DataIO.DataInputByteArray(var3, 0);
    byte[] var9 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var10 = new org.mapdb.DataIO.DataInputByteBuffer(var9);
    byte[] var12 = new byte[] { (byte)1};
    var10.readFully(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var0.compress(var3, 1, var12, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.HTreeMap var3 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.Bind.mapInverse((org.mapdb.Bind.MapWithModificationListener)var1, (java.util.Map)var3);
    long var5 = var3.getMaxExpireTime();
    java.lang.Object var7 = var3.remove((java.lang.Object)(short)0);
    java.util.Set var8 = var3.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    org.mapdb.Fun.Pair var2 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var3 = var2.toString();
    org.mapdb.DBMaker var4 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var5 = var4.strictDBGet();
    boolean var6 = var2.equals((java.lang.Object)var5);
    org.mapdb.DBMaker var7 = var5._newMemoryDirectDB();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Pair[0, hi!]"+ "'", var3.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var4 = new org.mapdb.DataIO.DataInputByteArray(var2, 0);
    int var5 = var4.getPos();
    int var6 = org.mapdb.DataIO.unpackInt((java.io.DataInput)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    org.mapdb.Volume.MemoryVol var2 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var3 = var2.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var5 = var2.getPackedLong(1L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    org.mapdb.Volume.MemoryVol var2 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var3 = var2.isEmpty();
    boolean var4 = var2.isEmpty();
    var2.ensureAvailable(0L);
    long var8 = var2.getLong(100L);
    long var10 = var2.getPackedLong(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    org.mapdb.Volume.MemoryVol var3 = new org.mapdb.Volume.MemoryVol(false, 100);
    var3.close();
    org.mapdb.Volume.MemoryVol var7 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    var7.ensureAvailable(0L);
    long var13 = var7.getLong(100L);
    var7.putByte(0L, (byte)1);
    org.mapdb.Volume.volumeTransfer(0L, (org.mapdb.Volume)var3, (org.mapdb.Volume)var7);
    var3.sync();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    byte[] var5 = new byte[] { (byte)1};
    var3.readFully(var5);
    boolean var7 = var3.readBoolean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var3.readUTF();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    var0.checkStructure();
    org.mapdb.HTreeMap var13 = org.mapdb.DBMaker.newCache(10.0d);
    java.util.Collection var14 = var13.values();
    long var15 = var13.getMinExpireTime();
    boolean var17 = var0.remove((java.lang.Object)var13, (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var4 = new org.mapdb.DataIO.DataInputByteArray(var2, 0);
    int var6 = var4.skipBytes(1);
    int var7 = var4.getPos();
    byte[] var9 = new byte[] { (byte)(-1)};
    var4.readFully(var9, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    org.mapdb.DataIO.DataOutputByteArray var0 = new org.mapdb.DataIO.DataOutputByteArray();
    var0.write(100);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    org.mapdb.StoreHeap var0 = new org.mapdb.StoreHeap();
    var0.compact();

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    org.mapdb.DataIO.DataOutputByteArray var0 = new org.mapdb.DataIO.DataOutputByteArray();
    var0.writeLong((-1L));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    org.mapdb.LongConcurrentHashMap var0 = new org.mapdb.LongConcurrentHashMap();
    org.mapdb.LongHashMap var2 = new org.mapdb.LongHashMap(100);
    boolean var3 = var0.containsValue((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    org.mapdb.Volume.MemoryVol var2 = new org.mapdb.Volume.MemoryVol(true, (-1));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var4 = new org.mapdb.DataIO.DataInputByteArray(var2, 0);
    org.mapdb.DataIO.DataInputToStream var5 = new org.mapdb.DataIO.DataInputToStream((java.io.DataInput)var4);
    int var6 = org.mapdb.DataIO.unpackInt((java.io.DataInput)var4);
    java.nio.ByteBuffer var7 = var4.internalByteBuffer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    org.mapdb.CompressLZF var0 = new org.mapdb.CompressLZF();
    byte[] var3 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var4 = new org.mapdb.DataIO.DataInputByteBuffer(var3);
    byte[] var5 = org.mapdb.EncryptionXTEA.getHash(var3);
    byte[] var9 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var11 = new org.mapdb.DataIO.DataInputByteArray(var9, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.expand(var3, 100, var9, 100, 128);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    byte var4 = var3.readByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var3.readUnsignedShort();
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)10);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0._newMemoryDirectDB();
    org.mapdb.DBMaker var2 = var0._newMemoryDirectDB();
    org.mapdb.DBMaker var4 = var0.cacheSize(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.strictDBGet();
    org.mapdb.DB var2 = var0.make();
    org.mapdb.DB.BTreeMapMaker var4 = var2.createTreeMap("");
    org.mapdb.CompressLZF var6 = new org.mapdb.CompressLZF();
    java.lang.Object var7 = var2.catGet("hi!", (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    org.mapdb.Volume.MemoryVol var2 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var3 = var2.isEmpty();
    boolean var4 = var2.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var2.putPackedLong(100L, (-1L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.HTreeMap var3 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.HTreeMap var5 = org.mapdb.DBMaker.newCache(10.0d);
    org.mapdb.Bind.mapInverse((org.mapdb.Bind.MapWithModificationListener)var3, (java.util.Map)var5);
    long var7 = var5.getMaxExpireTime();
    java.lang.Object var9 = var5.remove((java.lang.Object)(short)0);
    java.util.Iterator[] var10 = new java.util.Iterator[] { };
    java.util.Iterator var11 = org.mapdb.Pump.merge(var10);
    org.mapdb.CompressLZF var12 = new org.mapdb.CompressLZF();
    java.lang.Object var13 = var5.getOrDefault((java.lang.Object)var10, (java.lang.Object)var12);
    byte[] var16 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var18 = new org.mapdb.DataIO.DataInputByteArray(var16, 0);
    java.lang.Object var19 = var1.replace((java.lang.Object)var5, (java.lang.Object)var16);
    org.mapdb.DBMaker var21 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var22 = var21.strictDBGet();
    org.mapdb.DB var23 = var21.make();
    org.mapdb.DB.BTreeMapMaker var25 = var23.createTreeMap("");
    org.mapdb.Fun.Pair var28 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var29 = var28.toString();
    org.mapdb.LongHashMap var30 = new org.mapdb.LongHashMap();
    java.util.Iterator var31 = var30.valuesIterator();
    boolean var32 = var28.equals((java.lang.Object)var30);
    boolean var33 = var1.replace((java.lang.Object)(byte)0, (java.lang.Object)"", (java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Pair[0, hi!]"+ "'", var29.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.strictDBGet();
    org.mapdb.DB var2 = var0.make();
    org.mapdb.DB.BTreeMapMaker var4 = var2.createTreeMap("");
    org.mapdb.DB.BTreeMapMaker var5 = var4.valuesOutsideNodesEnable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    org.mapdb.StoreHeap var0 = new org.mapdb.StoreHeap();
    boolean var1 = var0.isReadOnly();
    java.util.Iterator var2 = var0.getFreeRecids();
    boolean var3 = var0.isReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    var0.checkStructure();
    java.util.Comparator[] var12 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var13 = new org.mapdb.Fun.ArrayComparator(var12);
    java.util.Comparator[] var14 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var15 = new org.mapdb.Fun.ArrayComparator(var14);
    java.util.Comparator var16 = var13.thenComparing((java.util.Comparator)var15);
    org.mapdb.HTreeMap var18 = org.mapdb.DBMaker.newCache(10.0d);
    java.util.Collection var19 = var18.values();
    long var20 = var18.getMinExpireTime();
    var18.clear();
    boolean var23 = var0.replace((java.lang.Object)var15, (java.lang.Object)var18, (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    org.mapdb.LongHashMap var1 = new org.mapdb.LongHashMap(100);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.valuesIterator();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.strictDBGet();
    org.mapdb.DB var2 = var0.make();
    org.mapdb.DB.BTreeMapMaker var4 = var2.createTreeMap("");
    org.mapdb.Atomic.String var7 = var2.createAtomicString("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    java.util.Collection var2 = var1.values();
    org.mapdb.Volume.MemoryVol var5 = new org.mapdb.Volume.MemoryVol(false, 100);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    boolean var8 = var1.containsValue((java.lang.Object)var5);
    var5.deleteFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    org.mapdb.StoreDirect var1 = new org.mapdb.StoreDirect("");

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    org.mapdb.Fun.Pair var13 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    boolean var15 = var13.equals((java.lang.Object)(byte)1);
    java.lang.Object var16 = var0.remove((java.lang.Object)var15);
    org.mapdb.BTreeMap var17 = org.mapdb.DBMaker.newTempTreeMap();
    org.mapdb.DBMaker var18 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var19 = var18._newMemoryDirectDB();
    org.mapdb.DBMaker var20 = var18._newMemoryDirectDB();
    org.mapdb.DBMaker var21 = var18.cacheWeakRefEnable();
    java.util.concurrent.ConcurrentNavigableMap var22 = var17.tailMap((java.lang.Object)var18);
    org.mapdb.DBMaker var23 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var24 = var23._newMemoryDirectDB();
    org.mapdb.DBMaker var25 = var23._newMemoryDirectDB();
    java.util.concurrent.ConcurrentNavigableMap var26 = var17.tailMap((java.lang.Object)var23);
    java.util.concurrent.ConcurrentNavigableMap var27 = var0.headMap((java.lang.Object)var17);
    java.util.Map.Entry var28 = var0.lastEntry();
    org.mapdb.DBMaker var29 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var30 = var29._newMemoryDirectDB();
    org.mapdb.DBMaker var31 = var29._newMemoryDirectDB();
    org.mapdb.DBMaker var32 = var29.cacheWeakRefEnable();
    java.util.Map.Entry var33 = var0.ceilingEntry((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    byte[] var13 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var14 = new org.mapdb.DataIO.DataInputByteBuffer(var13);
    int var16 = var14.skipBytes((-1));
    var14.setPos(10);
    java.util.Map.Entry var19 = var0.ceilingEntry((java.lang.Object)var14);
    java.lang.Object var21 = var0.get((java.lang.Object)(byte)10);
    org.mapdb.DBMaker var22 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var23 = var22.strictDBGet();
    java.util.concurrent.ConcurrentNavigableMap var24 = var0.headMap((java.lang.Object)var22);
    var0.printTreeStructure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Iterator[] var1 = new java.util.Iterator[] { };
    java.util.Iterator var2 = org.mapdb.Pump.merge(var1);
    java.lang.Object var3 = var0.lowerKey((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.strictDBGet();
    org.mapdb.DB var2 = var0.make();
    org.mapdb.DB.BTreeMapMaker var4 = var2.createTreeMap("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.Atomic.Integer var6 = var2.getAtomicInteger("Pair[0, hi!]");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
    org.mapdb.DataIO.DataInputByteArray var4 = new org.mapdb.DataIO.DataInputByteArray(var2, 0);
    int var6 = var4.skipBytes(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var7 = var4.readLong();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    org.mapdb.DataIO.DataInputByteBuffer var3 = new org.mapdb.DataIO.DataInputByteBuffer(var2);
    int var5 = var3.skipBytes((-1));
    var3.setPos(10);
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    org.mapdb.LongConcurrentHashMap var0 = new org.mapdb.LongConcurrentHashMap();
    boolean var1 = var0.isEmpty();
    java.lang.Object var3 = var0.remove(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    int var1 = org.mapdb.DataIO.longHash(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 98);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    org.mapdb.DataIO.DataOutputByteArray var0 = new org.mapdb.DataIO.DataOutputByteArray();
    var0.flush();
    var0.writeUTF("");

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newMemoryDB();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    org.mapdb.BTreeMap var0 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var1 = var0.values();
    org.mapdb.Fun.Pair var4 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var5 = var4.toString();
    org.mapdb.LongHashMap var6 = new org.mapdb.LongHashMap();
    java.util.Iterator var7 = var6.valuesIterator();
    boolean var8 = var4.equals((java.lang.Object)var6);
    java.lang.Object var9 = var0.floorKey((java.lang.Object)var8);
    java.util.Map.Entry var10 = var0.firstEntry();
    org.mapdb.Fun.Pair var13 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    boolean var15 = var13.equals((java.lang.Object)(byte)1);
    java.lang.Object var16 = var0.remove((java.lang.Object)var15);
    org.mapdb.BTreeMap var17 = org.mapdb.DBMaker.newTempTreeMap();
    java.util.Collection var18 = var17.values();
    org.mapdb.Fun.Pair var21 = new org.mapdb.Fun.Pair((java.lang.Object)(short)0, (java.lang.Object)"hi!");
    java.lang.String var22 = var21.toString();
    org.mapdb.LongHashMap var23 = new org.mapdb.LongHashMap();
    java.util.Iterator var24 = var23.valuesIterator();
    boolean var25 = var21.equals((java.lang.Object)var23);
    java.lang.Object var26 = var17.floorKey((java.lang.Object)var25);
    java.util.Map.Entry var27 = var17.firstEntry();
    var17.checkStructure();
    boolean var29 = var0.containsKey((java.lang.Object)var17);
    org.mapdb.Engine var30 = var0.getEngine();
    org.mapdb.Atomic.Boolean var32 = new org.mapdb.Atomic.Boolean(var30, (-1L));
    org.mapdb.Atomic.Boolean var34 = new org.mapdb.Atomic.Boolean(var30, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Pair[0, hi!]"+ "'", var5.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Pair[0, hi!]"+ "'", var22.equals("Pair[0, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    org.mapdb.HTreeMap var1 = org.mapdb.DBMaker.newCache(10.0d);
    java.util.Collection var2 = var1.values();
    long var3 = var1.getMinExpireTime();
    var1.clear();
    long var5 = var1.getMinExpireTime();
    java.util.Comparator[] var6 = new java.util.Comparator[] { };
    org.mapdb.Fun.ArrayComparator var7 = new org.mapdb.Fun.ArrayComparator(var6);
    java.util.Iterator[] var9 = new java.util.Iterator[] { };
    java.util.Iterator var10 = org.mapdb.Pump.merge(var9);
    java.util.Iterator var11 = org.mapdb.Pump.sort((java.util.Comparator)var7, true, var9);
    org.mapdb.Fun.Function1 var16 = org.mapdb.Volume.fileFactory(true, true, (-1), 1);
    org.mapdb.Fun.Function1 var21 = org.mapdb.Volume.fileFactory(true, true, 1, 1);
    org.mapdb.SerializerBase var24 = new org.mapdb.SerializerBase();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.mapdb.Pump.fillHTreeMap(var1, var11, var16, var21, (-1), true, (org.mapdb.Serializer)var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    org.mapdb.DBMaker var0 = org.mapdb.DBMaker.newTempFileDB();
    org.mapdb.DBMaker var1 = var0.strictDBGet();
    org.mapdb.DB var2 = var0.make();
    org.mapdb.DB.BTreeMapMaker var4 = var2.createTreeMap("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.concurrent.BlockingQueue var6 = var2.getQueue("Pair[0, hi!]");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
