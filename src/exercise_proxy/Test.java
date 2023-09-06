package exercise_proxy;

public class Test {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        downloader.download("url", "Chrom");

    }
}
