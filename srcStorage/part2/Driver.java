package part2;

class ExecutionTime {
	static ExecutionTime e;

	public static ExecutionTime getExecutionTime() {
		if (e == null) {
			e = new ExecutionTime();
		}
		return e;
	}
}

public class Driver {
	public static void main(String[] args) {
		ExecutionTime e1 = ExecutionTime.getExecutionTime();
		ExecutionTime e2 = ExecutionTime.getExecutionTime();
		ExecutionTime e3 = ExecutionTime.getExecutionTime();
		ExecutionTime e4 = ExecutionTime.getExecutionTime();
		ExecutionTime e5 = ExecutionTime.getExecutionTime();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	}
}
