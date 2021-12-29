export let Calculator =  class {
    add = (x, y) => {
      return  x + y
    }

    subtract = (x, y) => {
      return  x - y
    }

    multiply = (x, y) => {
      return  x * y
    }

    divide = (x, y) => {
      return  x / y
    }

    exp = (base, power) => {
      var product = 1

      for(var i=1;i<=power;i++)
        product = base * product

      return product
    }
  }
