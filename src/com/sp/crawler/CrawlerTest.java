package com.sp.crawler;

import java.util.ArrayList;
import java.util.List;

public class CrawlerTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        CrawlerSearch spider = new CrawlerSearch();
        spider.search("http://arstechnica.com/", "computer");
        //spider.search("https://twitter.com/geonews_english", "junoon");

        // if want to search on multiple sites then this code should be enable
        /*List<String> urls = new ArrayList<>();
        urls.add("https://en.wikipedia.org/wiki/Microsoft");
        urls.add("https://www.microsoft.com/en-pk/");

        for(String url : urls){
            spider.search(url, "office");
        }*/
    }
}
