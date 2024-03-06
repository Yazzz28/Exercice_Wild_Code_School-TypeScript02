/*export class Photo {
    url:string;
    filename:string;
    width: number;
    height: number;
}*/

// TS to JAVA

public class Photo {
    private String url;
    private String filename;
    private int width;
    private int height;
    // getters and setters

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}