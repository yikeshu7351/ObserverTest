package cn.observer.day;

public class Main {
	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		Teacher teacher1 = new Teacher("李老师", "33");
		Teacher teacher2 = new Teacher("王老师", "30");
		Student stu1 = new Student("张三", "22");
		Student stu2 = new Student("小明", "23");
		station.addObserver(teacher1);
		station.addObserver(teacher2);
		station.addObserver(stu1);
		station.addObserver(stu2);
		station.workWeather();
	}
}
