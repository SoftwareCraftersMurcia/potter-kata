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
});
