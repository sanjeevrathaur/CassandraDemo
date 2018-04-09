package com.test.snjv.cassandra;

import org.junit.Test;

import com.test.snjv.cassandra.SimpleClient;


public class SimpleClientTest {

	@Test
	public void testClient() {
		SimpleClient client = new SimpleClient();
		client.connect("127.0.0.1");
		client.getSession();
		client.createSchema();
		client.loadData();
		client.querySchema();
		client.closeSession();
		client.close();
	}
}
