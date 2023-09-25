package maratonajava.javacore.ZZEstreams.domain;

public class LightNovel {
    private String tile;
    private double price;

    public LightNovel(String tile, double price) {
        this.tile = tile;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "tile='" + tile + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
