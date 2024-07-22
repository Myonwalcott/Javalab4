public class JavaBasicsLab{

    private int numb;
    private String name;
    private double grades;
    private boolean present;

    public JavaBasicsLab(int numb, String name, double grades, boolean present) {
        this.numb = numb;
        this.name = name;
        this.grades = grades;
        this.present = present;
    }
// print values established
    public void myPrint() {
        System.out.println(numb);
        System.out.println(name);
        System.out.println(grades);
        System.out.println(present);
    }
// check if the class grades is a pass or fail
    public void checkNumber() {
        if (grades > 2) {
            System.out.println("This is a pass");
        } 
        else {
            System.out.println("This is a fail");
        }
    }
//print array f numbers using for loop 
    public void printNumbers() {
        for (int n = 10; n >= 1; n--) {
            System.out.println(n);
        }
    }

// calculate average numeber using for loop 
    public void calculateAverage(){
        double sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            count++;
        }
        double average = sum / count;
        System.out.println("Average: " + average);
    }

    public void isPrime(){
        boolean isPrime = true;
        if (grades <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } 
        else {
            for (int i = 2; i <= grades / 2; i++) {
                if (grades % i == 0) {
                    isPrime = false; // If a divisor is found, the number is not prime
                    break;
                }
            }
        }
        JavaBasicsLab myobject= new JavaBasicsLab(2, "thomas", 82, false);
        if (myobject.numb==2){
            System.out.println("the number is accurate");
        }

        if (isPrime) {
            System.out.println("This number is prime");
        } 
        else {
            System.out.println("This number is not prime");
        }
    }
    
}
