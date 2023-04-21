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
    const sizeOfSets = (new Set(basket)).size;
    const numberOfSets = sizeOfSets > 0 ?  Math.floor(basketSize / sizeOfSets) : 0;    
    const discount = DISCOUNTS[sizeOfSets] / 100;
    console.log(sizeOfSets,numberOfSets,discount)
    const fullPrice = 8;
    const discountedPrice = 8 * (1 - discount);
    const fullPriceBooks = basketSize - sizeOfSets;
    const discountedPriceBooks = sizeOfSets * numberOfSets;    
    return fullPriceBooks * fullPrice + discountedPriceBooks * discountedPrice;
};



module.exports = {calculatePrice};
