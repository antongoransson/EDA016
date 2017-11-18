package inl2;

public class Complex {
	private double re;
	private double im;
/**
 * Skapar en komplex variabel med realdelen re och imaginärdelen im
 * @param re
 * @param im
 */
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	/**
	 * Tar reda på realdelen
	 * @return
	 */
	public double getRe() {
		return re;
	}
	/**
	 * Tar reda på imaginärdelen
	 * @return
	 */
	public double getIm() {
		return im;
	}
	/**
	 * Tar reda på talets absolutbelopp i kvadrat
	 * @return
	 */
	public double getAbs2() {
		return re*re + im*im;
	}
	/**
	 * Adderar det komplexa talet c till detta tal
	 * @param c
	 */
	public void add(Complex c) {
		re = re + c.re;
		im = im + c.im;
	}
	/**
	 * Multiplicerar detta tal med det komplexa talet c
	 * @param c
	 */
	public void mul(Complex c) {
		double tempRe = re * c.re - im * c.im;
		im = re * c.im + c.re * im;
		re = tempRe;
	}
}
