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
		if ("����".equals(weather)) {
			System.out.println(name + "�߸�����ȥ��ѧ��");
		}
		else if ("����".equals(weather)) {
			System.out.println(name + "������ȥ��ѧ��");
		}
		else if ("��ѩ".equals(weather)) {
			System.out.println(name + "�ഩ�·�ȥ��ѧ��");
		}
		else if ("����".equals(weather)) {
			System.out.println(name + "��ɡȥ��ѧ��");
		}
		else if ("�η�".equals(weather)) {
			System.out.println(name + "����ʯͷȥ��ѧ��");
		}
	}
}
