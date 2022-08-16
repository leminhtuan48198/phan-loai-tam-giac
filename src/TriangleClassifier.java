public class TriangleClassifier {
    public static String classifyTriangle(int sideA,int sideB,int sideC){
       if(isNegative(sideA, sideB, sideC)){
           return "Khong phai tam giac";
       }else if(isNotTriangle(sideA, sideB, sideC)){
           return "Khong phai tam giac";
       } else if(laTamGiacDeu(sideA, sideB, sideC)) {
           return "Tam giac deu";
       }else if(laTamGiacCan(sideA, sideB, sideC)){
           return "Tam giac can";
       }else if(laTamGiacVuong(sideA, sideB, sideC)){
           return "Tam giac vuong";
       }else return "Tam giac thuong";
    }

    private static boolean laTamGiacVuong(int sideA, int sideB, int sideC) {
        return sideA * sideA + sideB * sideB == sideC * sideC || sideA * sideA + sideC * sideC == sideB * sideB || sideB * sideB + sideC * sideC == sideA * sideA;
    }

    private static boolean laTamGiacCan(int sideA, int sideB, int sideC) {
        return sideA == sideB || sideA == sideC || sideC == sideB;
    }

    private static boolean laTamGiacDeu(int sideA, int sideB, int sideC) {
        return sideA == sideB && sideA == sideC;
    }

    private static boolean isNotTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB <= sideC || sideA + sideC <= sideB || sideC + sideB <= sideA;
    }

    private static boolean isNegative(int sideA, int sideB, int sideC) {
        return sideA <= 0 || sideB <= 0 || sideC <= 0;
    }
}
