package maratonajava.javacore.ZZEstreams.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(tile, that.tile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tile);
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
