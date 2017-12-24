package Observer;

import Observable.Observable;

public class Reader implements Observer{
	
	private String name = null;
	
	private Observable news = null;
	
	public Reader(String name){
		this.name = name;
	}
	
	//訂閱方法 subscribe()，用來訂閱News。訂閱新聞則此讀者會被註冊
	@Override
	public void subscribe(Observable news) {
		// TODO Auto-generated method stub
		this.news = news;
		news.register(this);
	}

	//取消訂閱方法 unsubscribe()，用來取消訂閱News，取消訂閱新聞則此讀者會被取消註冊
	@Override
	public void unsubscribe() {
		// TODO Auto-generated method stub
		news.unregister(this);
	}

	//更新方法 update()，當News的狀態更新時，News會藉由此方法通知Reader
	@Override
	public void update(boolean isLastestNews) {
		// TODO Auto-generated method stub
		read(isLastestNews);
	}

	//閱讀方法 read()，依照News的狀態來閱讀新聞
	private void read(boolean latestNews){
		if(latestNews){
			System.out.println(name + " read latest news");
		} else {
			System.out.println(name + " read old news");
		}
	}
}
