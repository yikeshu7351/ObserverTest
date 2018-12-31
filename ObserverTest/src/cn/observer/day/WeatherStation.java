package cn.observer.day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class WeatherStation {
	private String[] weathers = {"晴天","下雨","雾霾","下雪","刮风"};
	private ArrayList<Weather> arrayList = new ArrayList<Weather>();
	
	public void addObserver(Weather wea) {
		arrayList.add(wea);
	}
	
	public void workWeather() {
		new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("in workWeather");
					Random random = new Random();
					int time = random.nextInt(1501);
					String weather = updateWeather();
					for (Weather wea : arrayList) {
						wea.notifyWeather(weather);
					}
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
		}).start();
	}
	
	public String updateWeather() {
		Random random =  new Random();
		int index = random.nextInt(weathers.length);
		return weathers[index];
	}
}
