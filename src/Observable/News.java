package Observable;

import java.util.ArrayList;

import Observer.Observer;

public class News implements Observable {

	//成員變數readerList中記錄了所有訂閱的讀者，任一讀者只要訂閱了新聞，即會被加入此readerList
	private ArrayList<Observer> readerList = new ArrayList<Observer>();
	
	//成員變數latestNews代表News的狀態，若為true表示最新
	private boolean latestNews = true;
	
	public boolean isLatestNews() {
		return latestNews;
	}
	
	//反之為舊的新聞，當呼叫setLatestNews()時會更改News的狀態
	//進而呼叫notify()方法去通知讀者名單readerList中的所有讀者
	public void setLatestNews(boolean latestNews) {
		this.latestNews = latestNews;
		notify(latestNews);
	}
	
	//註冊方法regsiter()，當讀者訂閱新聞時，該讀者會被加入讀者名單(readerList)
	@Override
	public void register(Observer reader) {
		// TODO Auto-generated method stub
		readerList.add(reader);
	}

	//取消註冊方法unregister()，當讀者取消訂閱時，該讀者會從讀者名單(readerList)中移除
	@Override
	public void unregister(Observer reader) {
		// TODO Auto-generated method stub
		readerList.remove(reader);
	}

	//通知方法notify()，在News的狀態更動時，會被呼叫來通知並更新所有的讀者
	@Override
	public void notify(boolean isLatestNews) {
		// TODO Auto-generated method stub
		for(Observer reader : readerList){
			reader.update(latestNews);
		}
	}

}
