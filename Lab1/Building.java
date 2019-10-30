public class Building{
	String building,building_colour;
	int no_floors, room_floors;	
	
	public void setname(String name){
		building=name;
	}
	
	public void setcolour(String colour){
		building_colour=colour;
	}
	
	public void setfloors(int floors){
		no_floors=floors;
	}
	
	public void setrooms(int rooms){
		room_floors=rooms;
	}
	
	public static void printReport(Building[] building_array){
		for (Building i:building_array)
		System.out.println(i.building+" is a "+i.building_colour+" building, and has "+i.no_floors*i.room_floors+" rooms.");
	}
	

	public static void main(String[] args){
		Building[] building_array=new Building[5];
		
		Building house=new Building();
		house.setname("Siwaka");
		house.setcolour("Blue");
		house.setfloors(22);
		house.setrooms(2);
		
		Building house2=new Building();
		house2.setname("Stc");
		house2.setcolour("Grey");
		house2.setfloors(5);
		house2.setrooms(8);
		
		Building house3=new Building();
		house3.setname("Lib");
		house3.setcolour("Brown");
		house3.setfloors(43);
		house3.setrooms(1);
		
		Building house4=new Building();
		house4.setname("msb");
		house4.setcolour("white");
		house4.setfloors(4);
		house4.setrooms(5);
		
		Building house5=new Building();
		house5.setname("stmb");
		house5.setcolour("green");
		house5.setfloors(4);
		house5.setrooms(7);
		
		building_array[0]=house;
		building_array[1]=house2;
		building_array[2]=house3;
		building_array[3]=house4;
		building_array[4]=house5;
		
		printReport(building_array);
	}
}
		
		
