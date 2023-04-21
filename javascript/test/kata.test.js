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

  it.only("returns 16 for two books of the same volumen", function(){
      const result = calculatePrice([1,1]);
      expect(result).toBe(16);
  });
  
  it("returns 15.20 for two different books", function(){
      const result = calculatePrice([1,2]);
      expect(result).toBe(15.2);
  });  
  
  it("returns 21.6 for three different books", function(){
      const result = calculatePrice([1,2,3]);
      expect(result).toBe(21.6);
  });  

  it("returns 25.6 for four different books", function(){
      const result = calculatePrice([1,2,3,4]);
      expect(result).toBe(25.6);
  });  
  
  it("returns 30 for five different books", function(){
      const result = calculatePrice([1,2,3,4,5]);
      expect(result).toBe(30);
  });   
  
  it("returns 23.20 for two 1s and a 2", function(){
      const result = calculatePrice([1,1,2]);
      expect(result).toBe(23.2);
  });   
  
  it("returns 30.40 for two 1s and two 2s", function(){
      const result = calculatePrice([1,1,2,2]);
      expect(result).toBe(30.40);
  });   

});
