package exercise_proxy;

public class FileDownloader implements Downloader{
    private String userAgent;
    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    public void download(String url, String userAgent) {
        System.out.println("Downloaded from " + userAgent);
    }
}
