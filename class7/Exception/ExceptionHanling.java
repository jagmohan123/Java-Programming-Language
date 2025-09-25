
// IT company me ese karte hai
// class DevideByZeroException extends Exception {
//     public DevideByZeroException(String msg) {
//         super(msg);
//     }
// }
// class ExceptionHanling {
//     public static void main(String[] args) {
//         int n1 = 24;
//         int n2 = 12;
//         try {
//             if (n2 == 0) {
//                 throw new DevideByZeroException("  happend, bcs a number can not devide by zero");
//             }
//             int ans = n1 / n2;
//             System.out.println("Devision Result is" + ans);
//         } catch (DevideByZeroException e) {
//             System.err.println("Error"+e.getMessage());
//         }
//     }
// }



//Normal Way 
class ExceptionHanling extends Exception {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 0;
        try {

            if (n2 == 0) {
                throw new Exception("zero se devide kar rhe ho");
            }

            int ans = n1 / n2;
            System.out.println("Devision Result is" + ans);

        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }
}
