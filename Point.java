class Point {
	String id
	double x,y;


	//TODO add new variable
	Stirng color;

	//TODO constructor
	public Point(String id, double x, double y, Stirng color) {
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

	public Stirng getColor() {
		return color;
	}

	public void setColor(Stirng color) {
		this.color = color;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection=='R')
			this.x++;
		else if(xDirection=="L")
			this.x++;
		if(yDirection=="U")
			this.y++;
		else if(yDirection=="D")
			this.y++;
	}

	public void draw () {
		//TODO
		System.out.println("(" + this.x + "," + this.y  + ")");
	}



}