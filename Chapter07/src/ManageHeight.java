
public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight height = new ManageHeight();
        height.setDate();
        /*
        for(int i=1; i<6; i++) {
            height.printHeight(i);
        }
        */
        int i = 1;
        while(i<6) {
            height.printAverage(i);
            i++;
        }
    }
    
    int[][] gradeHeights;
    
    public void setDate() {
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeights[1] = new int[] {160, 165, 167, 186};
        gradeHeights[2] = new int[] {158, 177, 187, 176};
        gradeHeights[3] = new int[] {173, 182, 181};
        gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
    }
    
    public void printHeight(int classNo) {
        int classNoLength = classNo - 1;
        System.out.println("Class No.:" + classNo);
        for(int i=0; i<gradeHeights[classNoLength].length; i++) {
            System.out.println(gradeHeights[classNoLength][i]);
        }
    }
    
    public void printAverage(int classNo) {
        double classSum = 0;
        int classNoLength = classNo - 1;
        System.out.println("Class No.:" + classNo);
        for(int i=0; i<gradeHeights[classNoLength].length; i++) {
            classSum += gradeHeights[classNoLength][i];
        }
        
        System.out.println(classSum / gradeHeights[classNoLength].length); 
    }
}
