const { calculatePrice } = require('../src/kata');

describe("Kata", function () {
  it("returns 0 for an empty basket", function () {
      const result = calculatePrice([]);
      expect(result).toBe(0);
  });

  it("returns 8 for just one book", function(){
      const result = calculatePrice([1]);
      expect(result).toBe(8);
  });

  it("returns 8 for *any* book", function(){
      const result = calculatePrice([2]);
      expect(result).toBe(8);
  });

  it("return 16 for two books of the same volumen", function(){
      const result = calculatePrice([1,1]);
      expect(result).toBe(16);
  });
  
  it("return 15.20 for two different books", function(){
      const result = calculatePrice([1,2]);
      expect(result).toBe(15.2);
  });  
  
  it("return 21.6 for three different books", function(){
      const result = calculatePrice([1,2,3]);
      expect(result).toBe(21.6);
  });  

});
