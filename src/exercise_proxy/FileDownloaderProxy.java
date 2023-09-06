package exercise_proxy;

public class FileDownloaderProxy implements Downloader{
    FileDownloader fileDownloader;
    public FileDownloaderProxy() {
        this.fileDownloader = new FileDownloader("Chrom");
    }
    @Override
    public void download(String url, String userAgent) {
        fileDownloader.download(url, userAgent);
    }
}
