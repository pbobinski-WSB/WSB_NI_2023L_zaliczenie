class Converter {
  private readonly cmInInch: number = 2.54;
  private readonly kmInMile: number = 1.609344;
  public inchesToCm(inches: number): number {
    return inches * this.cmInInch;
  }

  public fahrenheitToCelsius(temp: number): number {
    return (temp - 32) * (5 / 9);
  }

  public mileToKm(miles: number): number {
    return miles * this.kmInMile;
  }
}

export default new Converter();
