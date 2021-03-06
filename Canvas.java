import java.util.List;

class Point {
    String id
    double x, y;

    //TODO add new variable
    String color;

    //TODO constructor
    public Point(String id, double x, double y, String color) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //TODO setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(char xDirection, char yDirection) {
        //TODO
        if (Character.toString(xDirection).matches("L")) {
            this.x--;
        }
        if (Character.toString(xDirection).matches("R")) {
            this.x++;
        }
        if (Character.toString(yDirection).matches("U")) {
            this.y++;
        }
        if (Character.toString(yDirection).matches("D")) {
            this.y--;
        }
    }

    public void draw() {
        //TODO
        System.out.println(("(" + this.x + "," + this.y + ")"));
    }


}

class Canvas {
    List<Point> lista ;

    public Canvas(List<Point> lista) {
        this.lista = lista;
    }

    public void add(Point point) {
        lista.add(point);
    }

    public void remove(Point point) {
        lista.remove(point);
    }
}