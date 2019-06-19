public class baseBox {
    float length, width;
    int  height;

    public baseBox(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, int height){
        if (this.length >= length && this.width >= width && this.height >= height)
            return true;
        else
            return false;
    }
}
