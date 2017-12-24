package Observer;

import Observable.Observable;

public interface Observer {
	void subscribe(Observable news);//訂閱Observable的方法
	void unsubscribe();//取消訂閱Observable的方法
	void update(boolean isLastestNews);//Observable用來通知Observer的方法
}
