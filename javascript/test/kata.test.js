const { calculatePrice } = require('../src/kata');

describe("Kata", function () {
  it("returns 0 for an empty basket", function () {
      const result = calculatePrice([]);
      expect(result).toBe(0);
  });
});
