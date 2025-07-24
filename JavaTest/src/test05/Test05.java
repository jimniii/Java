package test05;

class Apple {
    private String country;
    private int price;

    public Apple(String country, int price) {
        this.country = country;
        this.price = price;
    }

    public String toString() {
        return "Apple [country=" + country + ", price=" + price + "]";
    }
}

class Banana {
    private String country;
    private int price;

    public Banana(String country, int price) {
        this.country = country;
        this.price = price;
    }

    public String toString() {
        return "Banana [country=" + country + ", price=" + price + "]";
    }
}

class Grape {
    private String country;
    private int price;

    public Grape(String country, int price) {
        this.country = country;
        this.price = price;
    }

    public String toString() {
        return "Grape [country=" + country + ", price=" + price + "]";
    }
}

public class Test05 {

    public static void main(String[] args) {

        Apple apple = new Apple("한국", 3000);
        Banana banana = new Banana("미국", 2000);
        Grape grape = new Grape("일본", 1000);

        showInfo(apple);
        showInfo(banana);
        showInfo(grape);

    }

    // Object가 최상위 클래스
    public static void showInfo(Object fruit) {

        if (fruit instanceof Apple) {
            Apple apple = (Apple) fruit;
            System.out.println(apple);
        } else if (fruit instanceof Banana) {
            Banana banana = (Banana) fruit;
            System.out.println(banana);
        } else if (fruit instanceof Grape) {
            Grape grape = (Grape) fruit;
            System.out.println(grape);
        }
    }
}
