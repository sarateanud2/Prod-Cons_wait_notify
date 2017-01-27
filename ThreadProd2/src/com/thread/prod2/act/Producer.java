package com.thread.prod2.act;

import com.thread.prod2.stores.Store;

public class Producer implements Runnable {
	
	Store store;

	public Producer(Store store) {
		super();
		this.store = store;
	}

	@Override
	public void run() {
		
		for (int i = 1; i < 6; i++) {
            store.put();
        }

	}

}
