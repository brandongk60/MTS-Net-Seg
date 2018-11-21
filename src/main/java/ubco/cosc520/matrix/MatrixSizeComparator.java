package ubco.cosc520.matrix;

import org.apache.commons.math3.linear.RealMatrix;

/**
 * Compares the size of 2 graphs.
 */
public class MatrixSizeComparator implements TwoMatrixOperator<Boolean> {

    /**
     * Compare the size of two matrices.
     *
     * @param g The first matrix
     * @param h The second matrix
     * @return {@code true} if matrices have the same dimensions.
     * {@code false} if matrices have different dimensions.
     */
    @Override
    public Boolean operate(final RealMatrix g, final RealMatrix h) {
        return g.getColumnDimension() == h.getColumnDimension()
                && g.getRowDimension() == h.getRowDimension();
    }

}
