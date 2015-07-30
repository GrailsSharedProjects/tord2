package tord2

class TordSitemap {
    static sitemap = "tord"

    List getSitemapUrls() {
        return [
            [url: 'http://www.tordchina.com/', lastmod: new Date(), priority: 0.8],
            [url: 'http://www.tordchina.com/portfolio', lastmod: new Date()],
            [url: 'http://www.tordchina.com/blog', lastmod: new Date(), changefreq: 'daily', priority: 1.0],
            [url: 'http://www.tordchina.com/project', lastmod: new Date()],
            [url: 'http://www.tordchina.com/shop', lastmod: new Date(), changefreq: 'daily', priority: 0.6],
        ]
    }

    String getDefaultChangeFrequency() {
        return "weekly"
    }

    Double getDefaultPriority() {
        return 0.5
    }
}
