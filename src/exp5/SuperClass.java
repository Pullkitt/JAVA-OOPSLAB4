package exp5;

public class SuperClass {
		    private int numprivate = 6;

		    public int getPrivatenum() {
		        return numprivate;
		    }
		}

		class ChildClass extends SuperClass {
		    public void display() {
		        // Trying to access privateMember directly will cause an error
			        System.out.println("Private member value: " + getPrivatenum());
		    
		}

		public class Main {
		    public static void main(String[] args) {
		        ChildClass obj = new ChildClass();
		        obj.display();
		    }
		}
	}

