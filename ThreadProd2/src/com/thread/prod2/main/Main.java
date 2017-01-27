package com.thread.prod2.main;

import com.thread.prod2.act.Consumer;
import com.thread.prod2.act.Producer;
import com.thread.prod2.stores.Store;

public class Main {

	public static void main(String[] args) {
		
		Store store = new Store();
		
		Consumer consumer = new Consumer(store);
		Producer producer = new Producer(store);
		
		
		new Thread(consumer).start();
		new Thread(producer).start();

	}

}
