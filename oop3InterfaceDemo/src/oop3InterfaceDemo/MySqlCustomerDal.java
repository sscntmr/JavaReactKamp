package oop3InterfaceDemo;

public class MySqlCustomerDal implements ICustomerDal,IRepository { //Bir class birden fazla interface i implement edebilir.

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	}

}
