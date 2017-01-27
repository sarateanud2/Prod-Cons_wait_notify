package com.thread.prod2.stores;

public class Store {
	
	private int product = 0;
	
	public synchronized void get(){
		while(product < 1){
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Get error");
			}
		}
		
		product--;
		System.out.println("Cumparatorul a cumparat 1 marfa");
		System.out.println("La depozit au ramas " + product);
		notify();
	}
	
	public synchronized void put(){
		while(product >= 3){
			try{
				wait();
			}catch (Exception e) {
				System.out.println("Put error");
			}
		}
		product++;
		System.out.println("Producatorul a adaugat 1 produs");
		System.out.println("In depozit sunt " + product);
		notify();
	}
}
