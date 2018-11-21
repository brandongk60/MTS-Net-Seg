package ubco.cosc520.matrix;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MatrixAbsoluteValueTest {


    @Test
    public void testAbsoluteValue() {
        double[][] input = {
                {1, 0, -2, 80},
                {2, 2, 2, 2},
                {2, 3, 9, 0}
        };

        double[][] output = {
                {1, 0, 2, 80},
                {2, 2, 2, 2},
                {2, 3, 9, 0}
        };

        RealMatrix rm = MatrixUtils.createRealMatrix(input);

        SingleMatrixOperator graphAbsoluteValue = new MatrixAbsoluteValue();

        RealMatrix result = graphAbsoluteValue.operate(rm);

        assertThat(rm, is(MatrixUtils.createRealMatrix(input)));
        assertThat(result, is(MatrixUtils.createRealMatrix(output)));
    }
}