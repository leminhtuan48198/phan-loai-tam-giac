import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    @DisplayName(" tam giac deu")
    void sideA2sideB2sideC2(){
        int sideA=2;
        int sideB=2;
        int sideC=2;
        String expected="Tam giac deu";
        String result=TriangleClassifier.classifyTriangle(sideA, sideB,sideC);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName(" tam giac can")
    void sideA2sideB2sideC3(){
        int sideA=2;
        int sideB=2;
        int sideC=3;
        String expected="Tam giac can";
        String result=TriangleClassifier.classifyTriangle(sideA, sideB,sideC);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName(" tam giac vuong")
    void sideA3sideB4sideC5(){
        int sideA=3;
        int sideB=4;
        int sideC=5;
        String expected="Tam giac vuong";
        String result=TriangleClassifier.classifyTriangle(sideA, sideB,sideC);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName(" 8 2 3")
    void sideA8sideB2sideC3(){
        int sideA=8;
        int sideB=2;
        int sideC=3;
        String expected="Khong phai tam giac";
        String result=TriangleClassifier.classifyTriangle(sideA, sideB,sideC);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName(" -1 2 1")
    void sideANegative1sideB2sideC1(){
        int sideA=-1;
        int sideB=2;
        int sideC=1;
        String expected="Khong phai tam giac";
        String result=TriangleClassifier.classifyTriangle(sideA, sideB,sideC);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName(" 0 1 1")
    void sideA0sideB1sideC1(){
        int sideA=0;
        int sideB=1;
        int sideC=1;
        String expected="Khong phai tam giac";
        String result=TriangleClassifier.classifyTriangle(sideA, sideB,sideC);
        assertEquals(expected,result);

    }
}
