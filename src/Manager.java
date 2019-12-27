
public class Manager extends Employee {
		private int age = 5;
		

		public Manager(int id, String name, int age) {
			super(id, name);
			this.age = age;
			// TODO Auto-generated constructor stub
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public String details()
		{
			return ("[id : " + super.getId () +"] ,[name : " + super.getName() + "] ,[balance :  " + super.getBalance() + "] ,[age : " + this.age + "]" );
		}
}
