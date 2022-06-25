import java.util.Scanner;

public class GradeList {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int grades[] = new int[4];

        for( int i = 0; i < grades.length; i++){

            System.out.println("Informe a nota do " + (i + 1) +" bimestre");
            grades[i] = scanner.nextInt();
        }

        for(int grade : grades){
            System.out.println(grade);
        }

        scanner.close();

    }
}
