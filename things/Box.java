package com.xworkz.september.things;

public class Box {
	public String typeOfBox;
    public String colour;
    public int numOfBox;
    public boolean boxIsOpenedOrClosed;
    public String shape;
    
    public Box() {
    	System.out.println("This is a Constructor of class name Box");
    }
    
    public Box(String colour ,String typeOfBox,int numOfBox,boolean boxIsOpenedOrClosed,String shape) {
    	this.colour =colour;
    	this.typeOfBox = typeOfBox;
    	this.numOfBox = numOfBox;
    	this.boxIsOpenedOrClosed = boxIsOpenedOrClosed;
    	this.shape = shape;
    	System.out.println("Colour:"+this.colour+"  "+"Type of box:"+this.typeOfBox+"  "+"Number of Boxes:"+this.numOfBox+"  "+"If box is opened or closed:"+this.boxIsOpenedOrClosed+"  "+"Shape of box:"+this.shape);
    }
         
}
