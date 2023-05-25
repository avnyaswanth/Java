package main.sample;

public class OuterClass {
    private int x;
    private String ocs;
    private InnerClass innerClass;

    public static class InnerClass {
        private int y;
        private String ics;

        public InnerClass() {}

        public InnerClass(int y, String ics) {
            this.y = y;
            this.ics = ics;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public String getIcs() {
            return ics;
        }

        public void setIcs(String ics) {
            this.ics = ics;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "y=" + y +
                    ", ics='" + ics + '\'' +
                    '}';
        }
    }

    public OuterClass() {}

    public OuterClass(int x, String ocs, InnerClass innerClass) {
        this.x = x;
        this.ocs = ocs;
        this.innerClass = innerClass;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getOcs() {
        return ocs;
    }

    public void setOcs(String ocs) {
        this.ocs = ocs;
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "x=" + x +
                ", ocs='" + ocs + '\'' +
                ", innerClass=" + innerClass +
                '}';
    }
}
