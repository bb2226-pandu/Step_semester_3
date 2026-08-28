class AttendanceMarks{

    public void classifyWithAttendance(int marks, int attendance) {

        boolean eligible = attendance >= 75 && marks >= 40;

        if (!eligible) {
            System.out.println("Detained");
        } 
        else if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {

        AttendanceMarks AM = new AttendanceMarks();

        AM.classifyWithAttendance(82, 80);
        AM.classifyWithAttendance(91, 60);
    }
}