package me.ivanyu.bloom_filter;

import org.junit.Assert;
import org.junit.Test;

public class BloomFilterTest {
    @Test
    public void stringTest() {
        final double p = 0.001;
        final int capacity = 100;
        final BloomFilter<String> filter = new BloomFilter<String>(p, capacity);

        filter.add("Hello world");
        filter.add("42");
        filter.add("Klaatu barada nikto");

        Assert.assertTrue(filter.test("Hello world"));
        Assert.assertTrue(filter.test("42"));
        Assert.assertTrue(filter.test("Klaatu barada nikto"));
        Assert.assertFalse(filter.test("Not"));
        Assert.assertFalse(filter.test("here"));
    }
}
