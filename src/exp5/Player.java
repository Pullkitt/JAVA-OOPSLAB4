package exp5;

public class Player {
	    String name;
	    int age;
	    String position;

	    public Player(String name, int age, String position) {
	        this.name = name;
	        this.age = age;
	        this.position = position;
	    }

	    public void play() {
	        System.out.println(name + " is playing in position: " + position);
	    }

	    public void train() {
	        System.out.println(name + " is training");
	    }
	}

	// Derived class Cricket_Player
	class Cricket_Player extends Player {
	    public Cricket_Player(String name, int age, String position) {
	        super(name, age, position);
	    }

	    @Override
	    public void play() {
	        System.out.println(name + " is batting in position: " + position);
	    }

	    @Override
	    public void train() {
	        System.out.println(name + " is training with cricket equipment");
	    }
	}

	class Football_Player extends Player {
	    public Football_Player(String name, int age, String position) {
	        super(name, age, position);
	    }

	    @Override
	    public void play() {
	        System.out.println(name + " is playing football in position: " + position);
	    }

	    @Override
	    public void train() {
	        System.out.println(name + " is training with football drills");
	    }
	}

	class Hockey_Player extends Player {
	    public Hockey_Player(String name, int age, String position) {
	        super(name, age, position);
	    }

	    @Override
	    public void play() {
	        System.out.println(name + " is playing hockey in position: " + position);
	    }

	    @Override
	    public void train() {
	        System.out.println(name + " is training with hockey sticks");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Cricket_Player cricketPlayer = new Cricket_Player("Pulkit", 07, "Batsman");
	        Football_Player footballPlayer = new Football_Player("Nipun", 18, "Forward");
	        Hockey_Player hockeyPlayer = new Hockey_Player("Harsh", 35, "Midfielder");

	        cricketPlayer.play();
	        cricketPlayer.train();

	        footballPlayer.play();
	        footballPlayer.train();

	        hockeyPlayer.play();
	        hockeyPlayer.train();
	    }
	}


