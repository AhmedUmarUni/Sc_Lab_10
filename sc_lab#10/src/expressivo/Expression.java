package expressivo;

/**
 * The Expression interface represents a generic mathematical expression.
 * Expressions can be constants, variables, or binary operations.
 * The expression is immutable and recursive.
 */
public interface Expression {

    /**
     * @return a string representation of this expression.
     */
    @Override
    public String toString();

    /**
     * @param thatObject any object
     * @return true if this and thatObject are structurally equal expressions.
     */
    @Override
    public boolean equals(Object thatObject);

    /**
     * @return a hash code value consistent with the equals() definition.
     */
    @Override
    public int hashCode();

    /**
     * @param variableValues a map of variable values
     * @return the evaluated result of this expression.
     */
    public double evaluate(java.util.Map<String, Double> variableValues);

    /**
     * Simplify the expression by applying algebraic simplifications.
     * @return a simplified expression.
     */
    public Expression simplify();
}
