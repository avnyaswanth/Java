package main.enums;


public enum Fruits {
    APPLE(5, 25, "RED") {

        @Override
        public boolean checkCanEat(int age) {
            return age <= 15 ? false : true;

        }
    },
    BANANA(6, 15, "YELLOW") {
        @Override
        public boolean checkCanEat(int age) {
            return age <= 13 ? false : true;
        }
    },
    PAPAYA(4, 35, "ORANGE") {
        @Override
        public boolean checkCanEat(int age) {
            return age <= 12 ? false : true;
        }
    },
    GRAPES(8, 5, "BLACK") {
        @Override
        public boolean checkCanEat(int age) {
            return age <= 10 ? false : true;
        }
    },
    MANGO(9, 45, "GREEN") {
        @Override
        public boolean checkCanEat(int age) {
            return age <= 18 ? false : true;
        }

    };

    @Override
    public String toString() {
        return this.name() +
                " taste=" + taste +
                ", price=" + price +
                ", color='" + color;
    }

    private int taste;
    private int price;
    private String color;
    public abstract boolean checkCanEat(int age);

    public float getTasteToPriceRatio() {
        return taste/(1.0f*price);
    }

    public int getTaste() {
        return taste;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    Fruits(final int taste, final int price, final String color) {
        this.taste = taste;
        this.price = price;
        this.color = color;
    }

    Fruits(final int taste, final int price) {
        this.taste = taste;
        this.price = price;
    }

    Fruits(final int price, final String color) {
        this.price = price;
        this.color = color;
    }
}
