import java.util.Scanner;

public class StudentGradeCalculator {
    int Physics,Chemistry,Maths,English,Biology;
    public  void getmarks() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Physics Marks:");
        Physics=sc.nextInt();
        if(Physics>100 || Physics<0){
            throw new IllegalArgumentException("Number must be between 0 to 100!");
        }
        System.out.println("Enter Chemistry Marks:");
        Chemistry=sc.nextInt();
        if(Chemistry>100 || Chemistry<0){
            throw new IllegalArgumentException("Number must be between 0 to 100!");
        }
        System.out.println("Enter Maths Marks:");
        Maths=sc.nextInt();
        if(Maths>100 || Maths<0){
            throw new IllegalArgumentException("Number must be between 0 to 100!");
        }
        System.out.println("Enter Biology Marks:");
        Biology=sc.nextInt();
        if(Biology>100 || Biology<0){
            throw new IllegalArgumentException("Number must be between 0 to 100!");
        }
        System.out.println("Enter English Marks:");
        English=sc.nextInt();
        if(English>100 || English<0){
            throw new IllegalArgumentException("Number must be between 0 to 100!");
        }
    }
    public int ClaculateSum(){
        int sum=Physics+Chemistry+English+Biology+Maths;
        return sum;
    }
    public float ClaculatePercentage(int sum){
        float percentage=sum/5;
        return percentage;
    }
    public String ClaculateGrade(float percentage){
        if(percentage>=91){
            return "A1";
        }
        else{
            if(percentage>=81){
                return "A2";
            }
            else{
                if(percentage>=71){
                    return "B1";
                }
                else{
                    if(percentage>=61){
                        return "B2";
                    }
                    else{
                        if(percentage>=51){
                            return "C1";
                        }
                        else{
                            if(percentage>=41){
                                return "C2";
                            }
                            else{
                                if(percentage>=33){
                                    return "D";
                                }
                                else{
                                    return "F";
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        StudentGradeCalculator student1=new StudentGradeCalculator();
        student1.getmarks();
        int sum=student1.ClaculateSum();
        float percentage=student1.ClaculatePercentage(sum);
        String Grade=student1.ClaculateGrade(percentage);
        System.out.println("-----Result-----");
        System.out.println("Total Marks Out of 500:"+sum);
        System.out.println("Percentage:"+percentage);
        System.out.println("Achived Grade:"+Grade);
    }
}
