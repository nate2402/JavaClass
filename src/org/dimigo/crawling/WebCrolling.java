package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrolling {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn")
                    .get(); //html document get
//            System.out.println(doc.html());
            Elements result = doc.select("[id=realTimeRankFavorite] li a");
            List<String> list = result.eachText();
            for(String title : list) {
                System.out.println(title);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
