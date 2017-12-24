package Main;

import Observable.News;
import Observer.Reader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		News news = new News();
		
		Reader john = new Reader("john"); // 新增讀者
		Reader mary = new Reader("mary");
		Reader bill = new Reader("bill");
		
		System.out.println("Subscribing Reader：john, mary, bill");
		
		// Observer(Reader)訂閱Observable(News)
		john.subscribe(news); //訂閱新聞
		mary.subscribe(news);
		bill.subscribe(news);
		
		news.setLatestNews(false); // 更改Observble(News)的狀態
		System.out.println();
		System.out.println();
		
		System.out.println("john Unsubscribe News");
		john.unsubscribe();
		news.setLatestNews(true); // 更改Observble(News)的狀態
		System.out.println();
		System.out.println();
		
		System.out.println("john Resubscribe News");
		john.subscribe(news);
		news.setLatestNews(true); // 更改Observble(News)的狀態
		System.out.println();
		System.out.println();
		
		System.out.println("Updating News status to old news");
		news.setLatestNews(false); // 更改Observble(News)的狀態
	}

}
