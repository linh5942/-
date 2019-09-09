//一物件導向繼承
//建立抽象的交通工具vehicle
//讓汽車和機車繼承


//交通工具類別-parent
abstract class vehicle{
		String name;	//名稱
		String color;	//顏色
		int tire;	//輪胎數
		
		public vehicle(String name,String color, int tire) {
			this.name = name;
			this.color = color;
			this.tire = tire;
		}
		
		public String getName() {
			return name;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getTire() {
			return tire;
		}
		
		public abstract String show(); //顯示資訊
}


//汽車類別-child
class Car extends vehicle{
	
	private int people;	//乘坐的人數
	
	public Car(String name, String color, int tire, int people) {
		super(name, color, tire);	//	繼承Vehicle的建構方法
		this.people = people;
	}
	public void setPeople(int people) {      
        this.people = people;
    }

    public int getPeople() {        
        return people;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getTire() {
        return tire;
    }

    public String show() {
        return "交通工具：" + super.getName() + " 顏色：" 
    + super.getColor() + " 輪胎數：" + super.getTire() 
    + " 載客數：" + this.getPeople() + "人";
    }
	
}

//機車類別-another child
class Scooter extends vehicle{
	
	private int price;
	
	public Scooter(String name, String color, int tire, int price) {
		super (name, color, tire);
		this.price = price;
	}
	
	 public void setPrice() {
	        this.price = price;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getColor() {
	        return color;
	    }

	    public int getTire() {
	        return tire;
	    }

	    public String show() {
	        return "交通工具：" + super.getName() + " 顏色：" 
	    + super.getColor() + " 輪胎數：" + super.getTire() 
	    + " 價格：" + this.getPrice();
	    }
	
	
}


public class test {

	public static void main(String[] args) {
	// new實體的汽車object並且給值
	Car car = new Car("汽車", "白色", 4, 4);  
        System.out.println(car.show());             

        // new實體的機車object並且給值
        Scooter scooter = new Scooter("機車", "海軍藍", 2, 55000);
        System.out.println(scooter.show());

	}

}
