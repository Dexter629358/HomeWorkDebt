package geekbrains.lessons.lesson2.task5;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * @return length of the vector
     * @apiNote Calculates the length of the vector.
     */
    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    /**
     * @param vector another vector
     * @return scalar product
     * @apiNote Calculates the scalar product.
     */
    public double scalar(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    /**
     * @param vector another vector
     * @return product
     * @apiNote Calculates the product.
     */
    public Vector multi(Vector vector) {
        return new Vector(this.y * vector.z - this.z * vector.y, this.z * vector.x - this.x * vector.z, this.x * vector.y - this.y * vector.x);
    }

    /**
     * @param vector another vector
     * @return angle between vectors
     * @apiNote Calculates the angle between vectors (or the cosine of the angle).
     */
    public double cos(Vector vector) {
        return this.scalar(vector) / (this.length() * vector.length());
    }

    @Override
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
