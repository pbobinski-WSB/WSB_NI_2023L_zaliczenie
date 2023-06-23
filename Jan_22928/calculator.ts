class Calculator {
  public add(x: number, y: number): number {
    return x + y;
  }

  public substract(x: number, y: number): number {
    return x - y;
  }

  public multiply(x: number, y: number): number {
    return x * y;
  }

  public divide(x: number, y: number): number {
    return x / y;
  }
}

export default new Calculator();
