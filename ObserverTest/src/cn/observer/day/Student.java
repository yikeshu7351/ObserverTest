package cn.observer.day;

public class Student implements Weather{
	private String name;
	private String age;
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void notifyWeather(String weather) {
		// TODO Auto-generated method stub
		if ("晴天".equals(weather)) {
			System.out.println(name + "高高兴兴去上学！");
		}
		else if ("雾霾".equals(weather)) {
			System.out.println(name + "戴口罩去上学！");
		}
		else if ("下雪".equals(weather)) {
			System.out.println(name + "多穿衣服去上学！");
		}
		else if ("下雨".equals(weather)) {
			System.out.println(name + "打伞去上学！");
		}
		else if ("刮风".equals(weather)) {
			System.out.println(name + "抗着石头去上学！");
		}
	}
}
