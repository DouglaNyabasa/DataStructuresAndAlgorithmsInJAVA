package DynamicProgram;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int discNo=3;

        shiftDisk(discNo,'A','B','C');
    }
    public static void shiftDisk(int diskNo,char TA,char TB,char TC){
        if (diskNo==1){
            System.out.println("disk 1 is shifted from Tower " + TA +" to Tower " + TC);
        }else {
            shiftDisk(diskNo-1,TA,TC,TB);
            System.out.println("Disk " + diskNo + " from " + TA + " is shifted to " + TC);
            shiftDisk(diskNo-1,TB,TA,TC);

        }

    }
}
