public class PyTheorem {
    public static void main(String[]args){
        int min = 5;
        int max = 23;

        double side1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        double side2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        double side3 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        double side4 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        double hyp1 = Math.sqrt((side1*side1)+(side2*side2));
        double hyp2 = Math.sqrt((side3*side3)+(side4*side4));
        System.out.println("Triangle 1          Side 1: " + side1 + "          Side 2: " + side2 + "          Hypotenuse: " + hyp1);
        System.out.println("Triangle 2          Side 1: " + side3 + "          Side 2: " + side4 + "          Hypotenuse: " + hyp2);
    }
}
