public class ComplexNumber {
    double re;
    double im;


    @Override
    public boolean equals(Object nameObject) {
        if (this == nameObject)
        { return true;}
        if (nameObject == null)
        { return false;}
        if (getClass() != nameObject.getClass())
        {return false;}

        ComplexNumber other = (ComplexNumber) nameObject;
        return java.util.Objects.equals(re, other.re)
                && java.util.Objects.equals(im, other.im);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(re, im);
    }


    public static void main(String[] args) {
        ComplexNumber ob1 = new ComplexNumber();
        ComplexNumber ob2 = new ComplexNumber();
        ob1.im = 123.123;
        ob1.re = 111.222;

        ob2.im = 123.123;


        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());

    }
}
