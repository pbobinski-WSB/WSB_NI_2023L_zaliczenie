class Converter {
  private cmInInch: number = 2.54;
  public inchesToCm(inches: number): number {
    return inches * this.cmInInch;
  }

  public fahrenheitToCelsius(temp: number): number {
    return (temp - 32) * (5 / 9);
  }
}

export default new Converter();
