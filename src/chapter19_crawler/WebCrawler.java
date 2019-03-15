package chapter19_crawler;

public class WebCrawler {

    private static final int MAX_DEPTH = 5;
    private static final int MAX_URL = 1000;

    private Set<String> crawledPages = new HashSet<String>();
    private List<CrawledData> pagesToCrawl = new LinkedList<CrawledData>();

    /***
     * @param URL : the starting point of the crawling
     * @param Keyphrase : the optional keyphrase
     * @throws IOException
     * @throws InterruptedException
     * this method calls subsequent helper class that extracts the hyperlinks from the submitted URL
     */

    public void startCrawl(CrawledData seed, String Keyphrase) throws IOException, InterruptedException{

        System.out.println("Inside startCrawl function!");
        CrawledData givenPage = seed;

        while(this.crawledPages.size() < MAX_URL && givenPage.depth <= MAX_DEPTH){
            WebCrawlerHelper helper = new WebCrawlerHelper();

            if(this.pagesToCrawl.isEmpty()){
                //none of the pages have been crawled, therefore add current URL to cralwed pages and go crawl it!
                if(helper.pageCrawler(givenPage, Keyphrase))
                {
                    this.crawledPages.add(givenPage.url);
                    System.out.println(givenPage.url + " and the depth is " + givenPage.depth);
                }
            }
            else{
                //there are URLs present in the list, go fetch the next list and crawl it.
                givenPage = this.getNextUrl();

                if(helper.pageCrawler(givenPage, Keyphrase))
                {
                    this.crawledPages.add(givenPage.url);
                    System.out.println(givenPage.url + " and the depth is " + givenPage.depth);
                }
            }


            this.pagesToCrawl.addAll(helper.getAllLinks());

        }

    }

    public CrawledData getNextUrl(){

        CrawledData nextPage;

        do{
            nextPage=this.pagesToCrawl.remove(0);
        }while(this.crawledPages.contains(nextPage.url));
        return nextPage;
    }

}
