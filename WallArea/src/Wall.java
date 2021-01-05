public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0.0, 0.0);
    }

    public Wall(double width, double height) {
        if(width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
        } else if(width < 0 && height >=0) {
            this.width = 0;
            this.height = height;
        } else if(width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if(height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getArea() {
        return width*height;
    }
}
