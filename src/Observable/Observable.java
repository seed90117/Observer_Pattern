package Observable;

import Observer.Observer;

public interface Observable {
	public void register(Observer reader);//註冊Observer的方法
	public void unregister(Observer reader);//取消註冊Observer的方法
	void notify(boolean isLatestNews);//還有通知所有Observer的方法
}
