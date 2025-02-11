package exp5;

	abstract class Worker {
	    String name;
	    double salaryRate;

	    Worker(String name, double salaryRate) {
	        this.name = name;
	        this.salaryRate = salaryRate;
	    }

	    abstract double computePay(int hours);

	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Salary Rate: $" + salaryRate);
	    }
	}

	// DailyWorker class extending Worker
	class DailyWorker extends Worker {
	    DailyWorker(String name, double salaryRate) {
	        super(name, salaryRate);
	    }

	    @Override
	    double computePay(int hours) {
	        int daysWorked = hours / 8;
	        return daysWorked * salaryRate;
	    }
	}

	// SalariedWorker class extending Worker
	class SalariedWorker extends Worker {
	    SalariedWorker(String name, double salaryRate) {
	        super(name, salaryRate);
	    }

	    @Override
	    double computePay(int hours) {
	        return salaryRate * 40; // Fixed wage for 40 hours per week
	    }
	}

	// Main class to test worker salary calculations
	public class main {
	    public static void main(String[] args) {
	        Worker dailyWorker = new DailyWorker("Pulkit Jain", 100); // $100 per day
	        Worker salariedWorker = new SalariedWorker("Rohit Tiwari", 25); // $25 per hour

	        System.out.println("Daily Worker Details:");
	        dailyWorker.displayDetails();
	        System.out.println("Weekly Pay (for 40 hours): $" + dailyWorker.computePay(40));

	        System.out.println("\nSalaried Worker Details:");
	        salariedWorker.displayDetails();
	        System.out.println("Weekly Pay (for 40 hours): $" + salariedWorker.computePay(40));
	    }
	}

}
