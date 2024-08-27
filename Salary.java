package nec.nit.nips;
public class Salary {
	public static void main(String[] args) {
				int[] salaries= {4000,2300,5000,23000,45000,8000,9000,4700,5600};
				 double avgSalary = calculateAverage(salaries);
			        System.out.println("Average Salary: " + avgSalary);
			        int[] newSalaries = adjustSalaries(salaries, avgSalary);
			        System.out.println("New Salaries:");
			        for (int salary : newSalaries) {
			            System.out.println(salary);
			        }
			    }
			    private static double calculateAverage(int[] salaries) {
			        int sum = 0;
			        for (int salary : salaries) {
			            sum += salary;
			        }
			        return (double) sum / salaries.length;
			    }
			    
			    
			    private static int[] adjustSalaries(int[] salaries, double avgSalary) {
			        int[] newSalaries = new int[salaries.length];
			        for (int i = 0; i < salaries.length; i++) {
			            if (salaries[i] < avgSalary) {
			                
			                newSalaries[i] = (int) (salaries[i] * 1.5);
			            } else {
			                
			                newSalaries[i] = salaries[i];
			            }
			        }
			        return newSalaries;
			}		
	}
		       
