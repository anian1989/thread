package SE;

public class ParamTest {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-29 ����10:42:39
	 * @param args
	 */
	public static void main(String[] args) {
		//1��ʵ��һ
		System.out.println("Testing tripleValue");
		double percent = 10;
		System.out.println("Before:percent="+percent);
		tripleValue(percent);
		System.out.println("After:percent="+percent);
		
		//2��ʵ���
		System.out.println("\nTesting tripleValue Object");
		StringBuffer percentD = new StringBuffer("��ʼ������������");
		System.out.println("Before:percent="+percentD);
		tripleValue(percentD);
		System.out.println("After:percent="+percentD);
		
		//2.1��ʵ���  ����String����
		System.out.println("\nTesting tripleValue Object");
		String percentS = "String��ʼ������������";
		System.out.println("Before:percent="+percentS);
		tripleValue(percentS);
		System.out.println("After:percent="+percentS);
		
		//3��ʵ��3
		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harry",50000);
		System.out.println("Before:salary="+harry.getSalary());
		tripleSalary(harry);
		System.out.println("After:salary="+harry.getSalary());
		
		//4��ʵ��4
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice",7000);
		Employee b = new Employee("Bob",6000);
		System.out.println("Before:a="+a.getName());
		System.out.println("Before:b="+b.getName());
		swap(a,b);
		
		System.out.println("After :a="+a.getName());
		System.out.println("After :b="+b.getName());
	}
	//һ�����������޸�Stringѽ
	public static void tripleValue(String  x){
		x = x+("����");
		System.out.println("End of method :x ="+x);
	}
	
	public static void tripleValue(StringBuffer x){
		x = x.append("����");
		System.out.println("End of method :x ="+x);
	}
	//һ�����������޸�һ�������������͵Ĳ���
	public static void tripleValue(double x){
		x = 3 * x;
		System.out.println("End of method :x ="+x);
	}
	//һ���������Ըı�һ�����������״̬
	public static void tripleSalary(Employee x){
		x.raiseSalary(200);
		System.out.println("End of method:x="+x.getSalary());
	}
	//һ����������ʵ���ö����������һ���µĶ���
	public static void swap(Employee x,Employee y){
		System.out.println("Before of method: x="+x.getName());
		System.out.println("Before of method: y="+y.getName());
		Employee temp = x;
		x= y;
		y = temp;
		System.out.println("End of method: x="+x.getName());
		System.out.println("End of method: y="+y.getName());
		
	}

}

class Employee {
	private String name;
	private double salary;
	
	public Employee(String n,double s){
		name = n;
		salary = s;
	}

	public void raiseSalary(double i) {
		double raise = salary*i/100;
		salary += raise;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
