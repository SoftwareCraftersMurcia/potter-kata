const DISCOUNTS = {
    0: 0,
    1: 0,
    2: 5,
    3: 10,
    4: 20,
    5: 25
}

const calculatePrice = (basket = []) => {
    const basketSize = basket.length;
    const differentBooks = (new Set(basket)).size;
    const discount = DISCOUNTS[differentBooks] / 100;
    const fullPrice = 8;
    const discountedPrice = 8 * (1 - discount);
    const fullPriceBooks = basketSize - differentBooks;
    const discountedPriceBooks = differentBooks;
    return fullPriceBooks * fullPrice + discountedPriceBooks * discountedPrice;
};

module.exports = {calculatePrice};
