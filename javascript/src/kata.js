const calculatePrice = (basket = []) => {   
    const basketSize = basket.length;
    const differentBooks = (new Set(basket)).size;
    const discount = (differentBooks - 1) * 0.05;
    const total = basketSize * 8;
    return total - discount * total;
};

module.exports = {calculatePrice};
